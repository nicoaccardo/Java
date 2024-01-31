package prg.Esercitazioni.esercitazione6.es4;

// Rappresenta una retta nella forma y = mx + q
public class Line {

    private Point2D firstPoint = new Point2D();
    private Point2D secondPoint = new Point2D();
    private double angularCoefficient;
    private double q;

    public Line(){}

    public Line(double firstPointX, double firstPointY, double secondPointX, double secondPointY){
        this.firstPoint.setX(firstPointX);
        this.firstPoint.setY(firstPointY);

        this.secondPoint.setX(secondPointX);
        this.secondPoint.setY(secondPointY);

        setAngularCoefficient();
        setQ();
    }

    private void setAngularCoefficient(){
        double deltaX = secondPoint.getX() - firstPoint.getX();
        double deltaY = secondPoint.getY() - firstPoint.getY();

        if(deltaX == 0){
            angularCoefficient = Double.NaN;
        } else {
            angularCoefficient = deltaY/deltaX;
        }
    }

    public double getAngularCoefficient(){
        return this.angularCoefficient;
    }

    private void setQ() {
        this.q = secondPoint.getY() - angularCoefficient * secondPoint.getX(); 
    }

    public double getQ(){
        return this.q;
    }

    public String toString() {
    
    if (Double.isNaN(angularCoefficient)) {
        return "x = " + firstPoint.getX();
    }
    
    if (angularCoefficient == 0) {
        return "y = " + this.getQ();
    }
    
    return "y = " + this.getAngularCoefficient() + "x + " + this.getQ();
    }
}