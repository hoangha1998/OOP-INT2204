public class Rectangle extends Shape {
    protected double width;
    protected double length;

    public Rectangle(){

    }
    public Rectangle(double width, double length){
        this.length = length;
        this.width = width;
    }

    public Rectangle(double width, double length, String color, boolean filled){
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return width*length;
    }

    @Override
    public double getPerimeter() {
        return 2*(width+length);
    }
    public String toString(){
        String sb = String.format("Rectangle[width=%f,length=%f,color=%s,filled=%b]",width,length,color,filled);
        return sb;
    }
}
