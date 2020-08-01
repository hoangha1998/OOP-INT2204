package task2;

import static java.lang.Math.abs;

public class Fraction {
    private int  numerator;
    private int denominator=1;

    public int getNumerator(){
        return numerator;}
    public int getDenominator(){
        return denominator;
    }

    public void setNumerator(int numerator){ this.numerator = numerator;}
    public void setDenominator(int denominator) {
        if (denominator != 0)
            this.denominator = denominator;
    }

    Fraction(){
    }
    Fraction(int numerator, int denominator){
        this.numerator = numerator;
        this.setDenominator(denominator);
    }

    public int ucln(int temp1, int temp2) {

        temp1 = abs(temp1);
        temp2 = abs(temp2);

        while (temp1 != temp2) {
            if (temp1 > temp2) {
                temp1 -= temp2;
            } else {
                temp2 -= temp1;
            }
        }
        return temp1;

    }


    public Fraction reduce(){
        int uc = ucln(this.getNumerator(), this.getDenominator());
        this.setNumerator(this.getNumerator() / uc);
        this.setDenominator(this.getDenominator() / uc);
        return this;
    }


    public Fraction add(Fraction f){
        Fraction fraction = new Fraction();
        fraction.setNumerator(this.numerator*f.denominator + f.numerator*this.denominator);
        fraction.setDenominator( this.denominator*f.denominator);
        if(fraction.getNumerator() != 0){
            fraction.reduce();
        }
        return fraction;
    }
    public Fraction subtract(Fraction f) {
        Fraction fraction = new Fraction();
        fraction.setNumerator(this.numerator*f.denominator - f.numerator*this.denominator);
        fraction.setDenominator(this.denominator*f.denominator);
        if(fraction.getNumerator() != 0){
            fraction.reduce();
        }
        return fraction;
    }

    public Fraction multiply(Fraction f){
        Fraction fraction = new Fraction();
        fraction.setNumerator(this.numerator*f.numerator);
        fraction.setDenominator(this.denominator*f.denominator);
        if(fraction.getNumerator() != 0){
            fraction.reduce();
        }
        return fraction;
    }

    public Fraction divide(Fraction f){
        Fraction fraction = new Fraction();
        fraction.setNumerator(this.numerator*f.denominator);
        fraction.setDenominator(this.denominator*f.numerator);
        if(fraction.getNumerator() != 0){
            fraction.reduce();
        }
        return fraction;
    }

    public boolean equals(Object obj){
        if(obj instanceof Fraction) {
            if (this.numerator * ((Fraction) obj).getDenominator() == ((Fraction) obj).getNumerator() * this.denominator)
                return true;
        }
        return false;
    }

    public static void main(String[] args){
        Fraction ps1 = new Fraction(1,-2);
        Fraction ps2 = new Fraction(-5, 10);
        Fraction ps3 = new Fraction(2,-4);
        Fraction ps4 = new Fraction(-5, -10);
        Fraction ps5 = new Fraction(0,5);
        Fraction ps6 = new Fraction(5, 0);
        Fraction ps7 = new Fraction(0, 0);
        Fraction test = new Fraction(-1445,10);
        test.reduce();

        System.out.println(test.getNumerator() + "/" + test.getDenominator());
    }
}
