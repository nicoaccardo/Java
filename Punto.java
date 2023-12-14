package prg.Esercitazioni.esercitazione4.es5;
import java.lang.Math;
public class Punto{

    private double x;
    private double y;

    public Punto() {
        this(0, 0);
    }
    
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
        double coordinataX = this.x - b.getX();
        double coordinataY = this.y - b.getY();
        return Math.hypot(coordinataX, coordinataY);
    }

    public boolean equals(Punto b){
        if(this.x == b.getX() && this.y == b.getY()){
            return true;
        }
        return false;
    }
}
