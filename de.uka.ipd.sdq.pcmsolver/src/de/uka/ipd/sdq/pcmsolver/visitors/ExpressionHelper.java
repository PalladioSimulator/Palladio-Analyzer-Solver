package de.uka.ipd.sdq.pcmsolver.visitors;

import java.util.Arrays;
import java.util.HashMap;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.apache.log4j.Logger;

import org.palladiosimulator.pcm.core.PCMRandomVariable;
import org.palladiosimulator.pcm.stochasticexpressions.parser.PCMStoExLexer;
import org.palladiosimulator.pcm.stochasticexpressions.parser.PCMStoExParser;

import de.uka.ipd.sdq.pcmsolver.transformations.ContextWrapper;
import de.uka.ipd.sdq.pcmsolver.transformations.ExpressionToPDFWrapper;
import de.uka.ipd.sdq.stoex.Expression;
import de.uka.ipd.sdq.stoex.analyser.visitors.ExpressionInferTypeVisitor;
import de.uka.ipd.sdq.stoex.analyser.visitors.StoExPrettyPrintVisitor;
import de.uka.ipd.sdq.stoex.analyser.visitors.TypeEnum;

public class ExpressionHelper {
	
	private static Logger logger = Logger.getLogger(ExpressionHelper.class.getName());

	/**
	 * @param specification
	 */
	public static Expression parseToExpression(String specification) {
		Expression expression = null;
		PCMStoExLexer lexer = new PCMStoExLexer(
				new ANTLRStringStream(specification));
		PCMStoExParser parser = new PCMStoExParser(new CommonTokenStream(lexer));
		try {
			expression = parser.expression();
		} catch (RecognitionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return expression;
	}
	
	public static String getSolvedExpressionAsString(String specification, ContextWrapper ctxWrp){
		Expression solvedExpression = getSolvedExpression(specification, ctxWrp);
		
		String solvedExprString = new StoExPrettyPrintVisitor().doSwitch(solvedExpression).toString();
		
		if (solvedExpression == null){
			throw new RuntimeException("Could not print solved expression "+specification);
		}
		
		return solvedExprString;
	}
		
	public static Expression getSolvedExpression(String specification,
			ContextWrapper ctxWrp) {
		Expression expr = parseToExpression(specification);
		return getSolvedExpression(expr, ctxWrp);
	}
	
	public static Expression getSolvedExpression(Expression expr, ContextWrapper ctxWrp){
		ExpressionInferTypeVisitor inferTypeVisitor = new ExpressionInferTypeVisitor();
		
		try {
			
			inferTypeVisitor.doSwitch(expr);
			
		} catch (UnsupportedOperationException e){
			// might be thrown if the inferred types are not compatible. However, sometimes variables are 
			// interpreted to strictly (e.g. characterization VALUE is assumed to be ANY_PMF), but maybe they
			// actually are of a type that is easier to handle.
			logger.error("Infering the type failed with an "+e.getClass().getName()+". I will try to ignore this and continue. Details:\n"
					+ e.getMessage() + "\n" + Arrays.toString(e.getStackTrace()));
			
			e.printStackTrace();
			
		}

		HashMap<Expression, TypeEnum> typeAnnotation = inferTypeVisitor
				.getTypeAnnotation();

		ExpressionParameterSolverVisitor solveVisitor = new ExpressionParameterSolverVisitor(
				typeAnnotation, ctxWrp);
		
		return (Expression) solveVisitor.doSwitch(expr);
	}
	
	public static HashMap<Expression,TypeEnum> getTypeAnnotation(Expression expr){
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
	
	
	public static double getMeanValue(PCMRandomVariable variable){
		ExpressionToPDFWrapper expToPDF = ExpressionToPDFWrapper.createExpressionToPDFWrapper(variable.getExpression());
		return expToPDF.getMeanValue();
	}
}
