package prg.Esercitazioni.esercitazione6.es3;

public abstract class Shape {
    private String color;
    private boolean filled;

    public Shape(){
        this.setColor("Black");
        this.setFill(false);
    }

    public Shape(String color, boolean filled){
        this.setColor(color);
        this.setFill(filled);
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFill(boolean filled) {
        this.filled = filled;
    }

    public String getColor(){
        return this.color;
    }

    public boolean getFill(){
        return this.filled;
    }

    public String toString(){
        return "Color " +this.getColor()+ "\nFilled: " +this.getFill();
    }

    public abstract double area();
    public abstract double perimeter();
}