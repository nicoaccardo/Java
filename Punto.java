package prg.Esercitazioni.esercitazione4.es5;
import java.lang.Math;
public class Punto{

    private double x;
    private double y;

    public Punto(double x, double y){
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

    public double distanza(Punto b){
        return Math.hypot(Math.abs(this.x - b.getX()), Math.abs(this.y - b.getY()));
    }

    public boolean equals(Punto b){
        if(this.x == b.getX() && this.y == b.getY()){
            return true;
        }
        return false;
    }
}