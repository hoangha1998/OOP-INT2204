package Task1;

public class Cylinder extends Circle{
    private double height;

    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public Cylinder() {
        this.height=1.0;
    }
    public Cylinder(double radius) {
        super(radius);
        this.height=1.0;
    }
    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;

    }
    public Cylinder(double radius, double height, String color) {
        super(radius,color);
        this.height=height;
    }

    @Override
    public String toString() {
        return "Cylinder[Circle[radius="+this.getHeight()+",color="+this.getColor()+
                "],height="+this.getRadius()+"]";
    }
    @Override
    public double getArea() {
        return 2*PI*this.getRadius()*this.getHeight();

    }
    public double getVolume() {
        return PI*height*this.getRadius();
    }

}