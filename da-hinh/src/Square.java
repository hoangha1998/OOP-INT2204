public class Square extends Rectangle {
    public Square(){

    }
    public Square(double side){
        this.setWidth(side);
        this.setLength(side);
    }
    public Square(double side,String color, boolean filled){
        super(side, side,color, filled);
    }
    public double getSide(){
        return this.width;
    }

    public void setSide(double side){
        this.length = side;
        this.width = side;
    }
    public void setWidth(double side){
        this.width = side;
    }
    public void setLength(double side){
        this.length = side;
    }

    public String toString(){
        String sb = String.format("Square[side=%f,color=%s,filled=%b]",length,color,filled);
        return sb;
    }

}
