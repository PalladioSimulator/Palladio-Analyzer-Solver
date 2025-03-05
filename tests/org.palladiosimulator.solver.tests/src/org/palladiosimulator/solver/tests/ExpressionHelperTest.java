package org.palladiosimulator.solver.tests;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.closeTo;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.everyItem;
import static org.hamcrest.Matchers.instanceOf;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.palladiosimulator.solver.core.visitors.ExpressionHelper;

import de.uka.ipd.sdq.probfunction.BoolSample;
import de.uka.ipd.sdq.probfunction.DoubleSample;
import de.uka.ipd.sdq.probfunction.IntSample;
import de.uka.ipd.sdq.probfunction.ProbabilityMassFunction;
import de.uka.ipd.sdq.probfunction.ProbfunctionFactory;
import de.uka.ipd.sdq.probfunction.Sample;
import de.uka.ipd.sdq.probfunction.StringSample;
import de.uka.ipd.sdq.probfunction.math.IProbabilityFunctionFactory;
import de.uka.ipd.sdq.probfunction.math.IProbabilityMassFunction;
import de.uka.ipd.sdq.probfunction.math.impl.ProbabilityFunctionFactoryImpl;
import de.uka.ipd.sdq.stoex.Expression;
import de.uka.ipd.sdq.stoex.ProbabilityFunctionLiteral;
import de.uka.ipd.sdq.stoex.ProductExpression;
import de.uka.ipd.sdq.stoex.StoexFactory;

public class ExpressionHelperTest {

    private static class ExpressionHelperAccessor extends ExpressionHelper {
        private ExpressionHelperAccessor() {
            // intentionally left blank
        }

        public static Expression transformExpressionToTypedExpressionPublic(Expression expression) {
            return ExpressionHelper.transformExpressionToTypedExpression(expression);
        }
    }

    private static final IProbabilityFunctionFactory IPROBFUNC_FACTORY = ProbabilityFunctionFactoryImpl.eINSTANCE;
    private static final ProbfunctionFactory PROBFUNC_FACTORY = ProbfunctionFactory.eINSTANCE;
    private static final StoexFactory STOEX_FACTORY = StoexFactory.eINSTANCE;

    @Test
    public void testTransformExpressionToTypedExpressionForBooleanStringSamples() {
        var iPmf = IPROBFUNC_FACTORY.createPMFFromMeasurements(new String[] { "true", "false" }, null, false);
        var pmf = callTransformExpressionWithIPmf(iPmf, Boolean.class);
        assertThat(pmf.getSamples()
            .size(), is(equalTo(2)));
        assertThat(pmf.getSamples(), everyItem(is(instanceOf(BoolSample.class))));
        assertThat(pmf.getSamples()
            .get(0)
            .getValue(), is(false));
        assertThat(pmf.getSamples()
            .get(0)
            .getProbability(), is(closeTo(0.5, 0.001)));
        assertThat(pmf.getSamples()
            .get(1)
            .getValue(), is(true));
        assertThat(pmf.getSamples()
            .get(1)
            .getProbability(), is(closeTo(0.5, 0.001)));
    }

    @Test
    public void testTransformExpressionToTypedExpressionForBooleanSamples() {
        var iPmf = IPROBFUNC_FACTORY.createPMFFromMeasurements(new Boolean[] { true, false }, null, false);
        var pmf = callTransformExpressionWithIPmf(iPmf, Boolean.class);
        assertThat(pmf.getSamples()
            .size(), is(equalTo(2)));
        assertThat(pmf.getSamples(), everyItem(is(instanceOf(BoolSample.class))));
        assertThat(pmf.getSamples()
            .get(0)
            .getValue(), is(false));
        assertThat(pmf.getSamples()
            .get(0)
            .getProbability(), is(closeTo(0.5, 0.001)));
        assertThat(pmf.getSamples()
            .get(1)
            .getValue(), is(true));
        assertThat(pmf.getSamples()
            .get(1)
            .getProbability(), is(closeTo(0.5, 0.001)));
    }

    @Test
    public void testTransformExpressionToTypedExpressionForDoubleSamples() {
        var iPmf = IPROBFUNC_FACTORY.createPMFFromMeasurements(new Double[] { 1.0, 2.0 }, 0.001, null, false);
        var pmf = callTransformExpressionWithIPmf(iPmf, Double.class);
        assertThat(pmf.getSamples()
            .size(), is(equalTo(2)));
        assertThat(pmf.getSamples(), everyItem(is(instanceOf(DoubleSample.class))));
        assertThat(pmf.getSamples()
            .get(0)
            .getValue(), is(1.0));
        assertThat(pmf.getSamples()
            .get(0)
            .getProbability(), is(closeTo(0.5, 0.001)));
        assertThat(pmf.getSamples()
            .get(1)
            .getValue(), is(2.0));
        assertThat(pmf.getSamples()
            .get(1)
            .getProbability(), is(closeTo(0.5, 0.001)));
    }

    @Test
    public void testTransformExpressionToTypedExpressionForIntegerSamples() {
        var iPmf = IPROBFUNC_FACTORY.createPMFFromMeasurements(new Integer[] { 1, 2 }, null, false);
        var pmf = callTransformExpressionWithIPmf(iPmf, Integer.class);
        assertThat(pmf.getSamples()
            .size(), is(equalTo(2)));
        assertThat(pmf.getSamples(), everyItem(is(instanceOf(IntSample.class))));
        assertThat(pmf.getSamples()
            .get(0)
            .getValue(), is(1));
        assertThat(pmf.getSamples()
            .get(0)
            .getProbability(), is(closeTo(0.5, 0.001)));
        assertThat(pmf.getSamples()
            .get(1)
            .getValue(), is(2));
        assertThat(pmf.getSamples()
            .get(1)
            .getProbability(), is(closeTo(0.5, 0.001)));
    }

    @Test
    public void testTransformExpressionToTypedExpressionForStringSamples() {
        var iPmf = IPROBFUNC_FACTORY.createPMFFromMeasurements(new String[] { "a", "b" }, null, false);
        var pmf = callTransformExpressionWithIPmf(iPmf, String.class);
        assertThat(pmf.getSamples()
            .size(), is(equalTo(2)));
        assertThat(pmf.getSamples(), everyItem(is(instanceOf(StringSample.class))));
        assertThat(pmf.getSamples()
            .get(0)
            .getValue(), is("a"));
        assertThat(pmf.getSamples()
            .get(0)
            .getProbability(), is(closeTo(0.5, 0.001)));
        assertThat(pmf.getSamples()
            .get(1)
            .getValue(), is("b"));
        assertThat(pmf.getSamples()
            .get(1)
            .getProbability(), is(closeTo(0.5, 0.001)));
    }

    @Test
    @SuppressWarnings("unchecked")
    public void testTransformExpressionToTypedExpressionForMixedSamples() {
        var pmf = PROBFUNC_FACTORY.createProbabilityMassFunction();
        var intSample = PROBFUNC_FACTORY.createIntSample();
        intSample.setValue(1);
        intSample.setProbability(0.5);
        pmf.getSamples()
            .add((Sample<Object>) (Sample<?>) intSample);
        var doubleSample = PROBFUNC_FACTORY.createDoubleSample();
        doubleSample.setValue(1.0);
        doubleSample.setProbability(0.5);
        pmf.getSamples()
            .add((Sample<Object>) (Sample<?>) doubleSample);
        var pfl = STOEX_FACTORY.createProbabilityFunctionLiteral();
        pfl.setFunction_ProbabilityFunctionLiteral(pmf);

        var expression = ExpressionHelperAccessor.transformExpressionToTypedExpressionPublic(pfl);

        var actualPmf = assertToPmf(Object.class, expression);
        assertThat(actualPmf.getSamples()
            .size(), is(equalTo(2)));
        assertThat(actualPmf.getSamples()
            .get(0), is(instanceOf(IntSample.class)));
        assertThat(actualPmf.getSamples()
            .get(0)
            .getValue(), is(1));
        assertThat(actualPmf.getSamples()
            .get(0)
            .getProbability(), is(closeTo(0.5, 0.001)));
        assertThat(actualPmf.getSamples()
            .get(1), is(instanceOf(DoubleSample.class)));
        assertThat(actualPmf.getSamples()
            .get(1)
            .getValue(), is(1.0));
        assertThat(actualPmf.getSamples()
            .get(1)
            .getProbability(), is(closeTo(0.5, 0.001)));
    }

    @Test
    public void testTransformExpressionToTypedExpressionForInvalidSample() {
        var pmf = PROBFUNC_FACTORY.createProbabilityMassFunction();
        var sample = PROBFUNC_FACTORY.createSample();
        sample.setValue(new Object());
        sample.setProbability(1.0);
        pmf.getSamples()
            .add(sample);
        var pfl = STOEX_FACTORY.createProbabilityFunctionLiteral();
        pfl.setFunction_ProbabilityFunctionLiteral(pmf);

        assertThrows(IllegalArgumentException.class,
                () -> ExpressionHelperAccessor.transformExpressionToTypedExpressionPublic(pfl));
    }

    @Test
    public void testTransformExpressionToTypedExpressionForMultiplication() {
        var iPmf0 = IPROBFUNC_FACTORY.createPMFFromMeasurements(new Integer[] { 1 }, null, false);
        var pmf0 = callTransformExpressionWithIPmf(iPmf0, Integer.class);
        var pfl0 = STOEX_FACTORY.createProbabilityFunctionLiteral();
        pfl0.setFunction_ProbabilityFunctionLiteral(pmf0);
        var iPmf1 = IPROBFUNC_FACTORY.createPMFFromMeasurements(new Integer[] { 2 }, null, false);
        var pmf1 = callTransformExpressionWithIPmf(iPmf1, Integer.class);
        var pfl1 = STOEX_FACTORY.createProbabilityFunctionLiteral();
        pfl1.setFunction_ProbabilityFunctionLiteral(pmf1);
        var product = STOEX_FACTORY.createProductExpression();
        product.setLeft(pfl0);
        product.setRight(pfl1);

        var expression = ExpressionHelperAccessor.transformExpressionToTypedExpressionPublic(product);

        assertThat(expression, is(instanceOf(ProductExpression.class)));
        var actualProduct = (ProductExpression) expression;
        var actualPmf0 = assertToPmf(Integer.class, actualProduct.getLeft());
        var actualPmf1 = assertToPmf(Integer.class, actualProduct.getRight());
        assertThat(actualPmf0.getSamples()
            .size(), is(equalTo(1)));
        assertThat(actualPmf0.getSamples()
            .get(0), is(instanceOf(IntSample.class)));
        assertThat(actualPmf1.getSamples()
            .size(), is(equalTo(1)));
        assertThat(actualPmf1.getSamples()
            .get(0), is(instanceOf(IntSample.class)));
    }

    protected <T> ProbabilityMassFunction<T> callTransformExpressionWithIPmf(IProbabilityMassFunction iPmf,
            Class<T> valueType) {
        var pmf = IPROBFUNC_FACTORY.transformToModelPMF(iPmf);
        var literal = STOEX_FACTORY.createProbabilityFunctionLiteral();
        literal.setFunction_ProbabilityFunctionLiteral(pmf);

        var expression = ExpressionHelperAccessor.transformExpressionToTypedExpressionPublic(literal);

        return assertToPmf(valueType, expression);
    }

    @SuppressWarnings("unchecked")
    protected <T> ProbabilityMassFunction<T> assertToPmf(Class<T> valueType, Expression expression) {
        assertThat(expression, is(instanceOf(ProbabilityFunctionLiteral.class)));
        var pfl = ((ProbabilityFunctionLiteral) expression).getFunction_ProbabilityFunctionLiteral();
        assertThat(pfl, is(instanceOf(ProbabilityMassFunction.class)));
        var actualPmfUntyped = (ProbabilityMassFunction<?>) pfl;
        for (var sample : actualPmfUntyped.getSamples()) {
            assertThat(sample.getValue(), is(instanceOf(valueType)));
        }
        return (ProbabilityMassFunction<T>) actualPmfUntyped;
    }

}
