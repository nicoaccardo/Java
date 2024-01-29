package prg.Esercitazioni.esercitazione6.es5;
import prg.Esercitazioni.esercitazione6.es4.Point2D;

public class Point3D extends Point2D{
    private double z;

    public Point3D(){
        super();
        this.setZ(1);
    }

    public Point3D(double x, double y, double z){
        super(x,y);
        this.setZ(z);
    }

    public void setZ(double z){
        this.z = z;
    }

    public double getZ(){
        return this.z;
    }

    public String toString(){
        return "Il punto ha coordinate: (" +getX()+ ", " +getY()+ ", " +this.getZ()+ ")";
    }
}