package exception.task1;

public class Numeral extends Expression {
    private double value;

    public Numeral(){
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public Numeral(double value){
        this.value = value;
    }

    @Override
    public String toString() {
        return String.valueOf(this.getValue());
    }

    @Override
    public double evaluate() {
        return this.getValue();
    }
}
