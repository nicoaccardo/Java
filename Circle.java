package prg.Esercitazioni.esercitazione6.es3;

public class Circle extends Shape {
    private double radius;

    public Circle(){
        super();
        this.setRadius(1);
    }

    public Circle(String color, boolean filled, double radius){
        super(color, filled);
        this.setRadius(radius);
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getRadius(){
        return this.radius;
    }

    public String toString(){
        return "Color: " +this.getColor()+ "\nFilled: " +this.getFill()+ "\nRadius " +this.getRadius();
    }

    @Override
    public double area(){
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter(){
        return 2*Math.PI*radius;
    }
}