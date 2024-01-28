package prg.Esercitazioni.esercitazione6.es3;

public class Rectangle extends Shape{
    private double width;
    private double length;

    public Rectangle(){
        super();
        this.setLength(1);
        this.setWidth(2);
    }

    public Rectangle(String color, boolean filled, double length, double width){
        super(color, filled);
        this.setLength(length);
        this.setWidth(width);
    }

    public void setLength(double length){
        if(length>0){
            this.length = length;
        } else {
            this.length = 1;
        }
    }

    public void setWidth(double width){
        if(width>0){
            this.width = width;
        } else {
            this.width = 2;
        }
    }

    public double getWidth(){
        return this.width;
    }

    public double getLength(){
        return this.length;
    }

    public String toString(){
        return "Color: " +this.getColor()+ "\nFilled: " +this.getFill()+ "\nWidth: " +this.getWidth()+ "\nLength: " +this.getLength();
    }

    @Override
    public double area(){
        return width*length;
    }

    @Override
    public double perimeter(){
        return 2*(width+length);
    }
}