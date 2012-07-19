package eu.stratosphere.sopremo.expressions;


public class ExpressionFactory {

	public Class<?> getExpressionType(final String text) {
		try {
			return Class.forName(String.format("%s.%s", EvaluationExpression.class.getPackage().getName(), text));
		} catch (final ClassNotFoundException e) {
			throw new IllegalStateException("Unknown expression type " + text, e);
		}
	}

}
