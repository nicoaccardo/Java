package prg.Esercitazioni.esercitazione6.es5;
public class Plane{
    private Point3D p1;
    private Point3D p2;
    private Point3D p3;
    private double a, b, c, d;

    public Plane(){

    }

    public Plane(double p1[], double p2[], double p3[]){
        this.p1 = new Point3D(p1[0], p1[1], p1[2]);
        this.p2 = new Point3D(p2[0], p2[1], p2[2]);
        this.p3 = new Point3D(p3[0], p3[1], p3[2]);
        calculateCoeff();
    }

    private void calculateCoeff() {
		double deltaY21 = p2.getY() - p1.getY();
		double deltaY31 = p3.getY() - p1.getY();
		
		double deltaZ21 = p2.getZ() - p1.getZ();
		double deltaZ31 = p3.getZ() - p1.getZ();
		
		double deltaX21 = p2.getX() - p1.getX();
		double deltaX31 = p3.getX() - p1.getX();
		
		a = deltaY21 * deltaZ31 - deltaY31 * deltaZ21;
		b = deltaX21 * deltaZ31 - deltaX31 * deltaZ21;
		c = deltaX21 * deltaY31 - deltaX31 * deltaY21;
		
		
		d = -p1.getX()*a +p1.getY()*b - p1.getZ()*c;
	}
	
	public String toString() {
		return a + "x " + b + "y " + c + "z " + d; 
	}
}