public class Circle extends Shape {
    protected double radius;

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle(){

    }
    public Circle(double radius){
        this.setRadius(radius);
    }

    public Circle(double radius,String color, boolean filled){
        super(color,filled);
        this.setRadius(radius);
    }

    @Override
    public double getArea() {

        return this.getRadius()*this.getRadius()*3.14;
    }

    @Override
    public double getPerimeter() {
        return this.getRadius()*2*3.14;
    }

    public String toString(){
        String sb = String.format("Circle[radius=%f,color=%s,filled=%b]",radius,color,filled);
        return sb;
    }
}
