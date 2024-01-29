package prg.Esercitazioni.esercitazione6.es4;

public class Point2D {
    private double x;
    private double y;

    public Point2D(){
        this.setX(1);
        this.setY(1);
    }

    public Point2D(double x, double y){
        this.setX(x);
        this.setY(y);
    }

    public void setX(double x){
        this.x = x;
    }

    public void setY(double y){
        this.y = y;
    }

    public double getX(){
        return this.x;
    }

    public double getY(){
        return this.y;
    }

    public String toString(){
        return "Il punto ha coordinate: (" +this.getX()+ "),(" +this.getY()+ ")";
    }
}