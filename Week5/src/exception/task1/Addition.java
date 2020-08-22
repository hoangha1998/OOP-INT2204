package exception.task1;

public class Addition extends BinaryExpression  {

    public Addition(Expression left, Expression right){
        super(left, right);
    }

    @Override
    public String toString() {
        return String.format("%f + %f",this.getLeft().evaluate(),this.getRight().evaluate());
    }

    @Override
    public double evaluate() {
        return this.getLeft().evaluate() + this.getRight().evaluate();
    }

}
 
