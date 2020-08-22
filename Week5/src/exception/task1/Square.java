package exception.task1;

public class Square extends Expression  {
    private Expression expression;

    public Square(Expression expression){
        this.expression = expression;
    }

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    @Override
    public String toString() {
        return Double.toString(this.evaluate());
    }

    @Override
    public double evaluate() {
        return this.getExpression().evaluate()*this.getExpression().evaluate();
    }
}

