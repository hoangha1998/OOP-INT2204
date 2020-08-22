package exception.task1;

public class ExpressionTest extends Expression {
    @Override
    public String toString() {
        String sb = "((((10) ^ 2 + -3) + (4 * 3))) ^ 2";
        return sb;
    }

    @Override
    public double evaluate() {
        return (10^2 - 3 + 4*3)^2;
    }


}