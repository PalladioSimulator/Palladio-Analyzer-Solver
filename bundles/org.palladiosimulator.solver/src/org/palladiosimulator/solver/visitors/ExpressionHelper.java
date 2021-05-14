package org.palladiosimulator.solver.visitors;

import java.io.NotSerializableException;
import java.text.ParseException;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;
import java.util.stream.Collectors;

import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.palladiosimulator.pcm.core.PCMRandomVariable;
import org.palladiosimulator.pcm.stoex.api.StoExParser;
import org.palladiosimulator.pcm.stoex.api.StoExSerialiser;
import org.palladiosimulator.solver.transformations.ContextWrapper;
import org.palladiosimulator.solver.transformations.ExpressionToPDFWrapper;

import de.uka.ipd.sdq.probfunction.ProbabilityMassFunction;
import de.uka.ipd.sdq.probfunction.ProbfunctionFactory;
import de.uka.ipd.sdq.probfunction.Sample;
import de.uka.ipd.sdq.stoex.Expression;
import de.uka.ipd.sdq.stoex.analyser.visitors.ExpressionInferTypeVisitor;
import de.uka.ipd.sdq.stoex.analyser.visitors.TypeEnum;

public class ExpressionHelper {
	
	private static final Logger LOGGER = Logger.getLogger(ExpressionHelper.class.getName());
	private static final StoExParser STOEX_PARSER = StoExParser.createInstance();
	private static final StoExSerialiser STOEX_SERIALISER = StoExSerialiser.createInstance();
	
	/**
	 * @param specification
	 */
	public static Expression parseToExpression(String specification) {
		Expression expression = null;
		try {
			expression = STOEX_PARSER.parse(specification);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return expression;
	}
	
    public static String getSolvedExpressionAsString(String specification, ContextWrapper ctxWrp) {
        Expression solvedExpression = getSolvedExpression(specification, ctxWrp);
        try {
            Expression typedExpression = transformExpressionToTypedExpression(solvedExpression);
            return STOEX_SERIALISER.serialise(typedExpression);
        } catch (NotSerializableException e) {
            throw new RuntimeException("Could not print solved expression " + specification, e);
        }
    }

    /**
     * This method transforms an expression containing generic samples into an expression containing
     * concrete samples if possible. This is necessary in order to serialize the expression.
     * 
     * For some reason, the probability function logic decided to solely work with generic samples
     * (SampleImpl<?>) instead of the concrete subtypes. Unfortunately, the serialize does not know
     * how to serialize these generic types. Therefore, this method tries to avoid this error by
     * providing a copy of the given expression that only contains concrete sample types. This is
     * only possible if all values of a PMF are of the same type. Mixed value types are not
     * supported by this method as well as the serializer.
     * 
     * @param expression
     *            The expression to transform.
     * @return An adjusted copy of the expression.
     */
    protected static Expression transformExpressionToTypedExpression(Expression expression) {
        var expressionCopy = EcoreUtil.copy(expression);
        for (var iter = expressionCopy.eAllContents(); iter.hasNext();) {
            var currentEObject = iter.next();
            if (currentEObject instanceof ProbabilityMassFunction) {
                iter.prune();
                @SuppressWarnings("unchecked")
                var pmf = (ProbabilityMassFunction<Object>) currentEObject;
                transformPMFToTypedPMF(pmf);
            }
        }
        return expressionCopy;
    }

    protected static void transformPMFToTypedPMF(ProbabilityMassFunction<Object> pmf) {
        var genericSamples = pmf.getSamples();
        if (!allSamplesHaveSameValueType(genericSamples)) {
            return;
        }
        if (allSamplesHaveBooleanStringLiterals(genericSamples)) {
            genericSamples.stream()
                .forEach(s -> s.setValue(Boolean.parseBoolean((String) s.getValue())));
        }
        var typedSamples = genericSamples.stream()
            .map(ExpressionHelper::transformToNonGenericModelSample)
            .collect(Collectors.toList());
        pmf.getSamples()
            .clear();
        pmf.getSamples()
            .addAll(typedSamples);
    }
    
    protected static boolean allSamplesHaveBooleanStringLiterals(Collection<Sample<Object>> samples) {
        return samples.stream()
            .map(Sample::getValue)
            .collect(Collectors.toSet())
            .equals(Set.of("true", "false"));
    }
    
    protected static boolean allSamplesHaveSameValueType(Collection<Sample<Object>> samples) {
        return samples.stream()
            .map(Sample::getValue)
            .map(Object::getClass)
            .collect(Collectors.toSet())
            .size() == 1;
    }

    @SuppressWarnings("unchecked")
    protected static Sample<Object> transformToNonGenericModelSample(Sample<? extends Object> sample) {
        var eFactory = ProbfunctionFactory.eINSTANCE;
        var value = sample.getValue();
        if (value instanceof Integer) {
            var newSample = eFactory.createIntSample();
            newSample.setProbability(sample.getProbability());
            newSample.setValue((Integer) value);
            return ((Sample<Object>) (Sample<?>) newSample);
        }
        if (value instanceof Double) {
            var newSample = eFactory.createDoubleSample();
            newSample.setProbability(sample.getProbability());
            newSample.setValue((Double) value);
            return ((Sample<Object>) (Sample<?>) newSample);
        }
        if (value instanceof Boolean) {
            var newSample = eFactory.createBoolSample();
            newSample.setProbability(sample.getProbability());
            newSample.setValue((Boolean) value);
            return ((Sample<Object>) (Sample<?>) newSample);
        }
        if (value instanceof String) {
            var newSample = eFactory.createStringSample();
            newSample.setProbability(sample.getProbability());
            newSample.setValue((String) value);
            return ((Sample<Object>) (Sample<?>) newSample);
        }
        throw new IllegalArgumentException("Value type contained in sample is not supported.");
    }

    public static Expression getSolvedExpression(String specification,
			ContextWrapper ctxWrp) {
		Expression expr = parseToExpression(specification);
		return getSolvedExpression(expr, ctxWrp);
	}
	
	public static Expression getSolvedExpression(Expression expr, ContextWrapper ctxWrp) {
		ExpressionInferTypeVisitor inferTypeVisitor = new ExpressionInferTypeVisitor();
		
		try {
			
			inferTypeVisitor.doSwitch(expr);
			
		} catch (UnsupportedOperationException e) {
			// might be thrown if the inferred types are not compatible. However, sometimes variables are 
			// interpreted to strictly (e.g. characterization VALUE is assumed to be ANY_PMF), but maybe they
			// actually are of a type that is easier to handle.
            LOGGER.error("Infering the type failed with an " + e.getClass()
                .getName() + ". I will try to ignore this and continue. Details:\n" + e.getMessage() + "\n"
                    + Arrays.toString(e.getStackTrace()));

			e.printStackTrace();
			
		}

		HashMap<Expression, TypeEnum> typeAnnotation = inferTypeVisitor
				.getTypeAnnotation();

		ExpressionParameterSolverVisitor solveVisitor = new ExpressionParameterSolverVisitor(
				typeAnnotation, ctxWrp);
		
		return (Expression) solveVisitor.doSwitch(expr);
	}
	
	public static HashMap<Expression, TypeEnum> getTypeAnnotation(Expression expr) {
		ExpressionInferTypeVisitor inferTypeVisitor = 
			new ExpressionInferTypeVisitor();
		inferTypeVisitor.doSwitch(expr);
		return inferTypeVisitor.getTypeAnnotation();
	}

	/**
	 * calculated the mean value for a solved expression
	 * @param expression
	 * @return
	 * @throws IllegalArgumentException if the passed expression has not been solved before. 
	 */
	public static double meanValue(Expression expression) throws IllegalArgumentException {
		ExpressionToPDFWrapper wrapper = ExpressionToPDFWrapper.createExpressionToPDFWrapper(expression);
		return wrapper.getMeanValue();
	}
	
	
	public static double getMeanValue(PCMRandomVariable variable) {
		ExpressionToPDFWrapper expToPDF = ExpressionToPDFWrapper.createExpressionToPDFWrapper(variable.getExpression());
		return expToPDF.getMeanValue();
	}
}
