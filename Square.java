package prg.Esercitazioni.esercitazione6.es3;

public class Square extends Rectangle{

    public Square(){
        super();
        this.setLength(1);
        this.setWidth(1);
    }

    public Square(String color, boolean filled, double lato){
        super(color, filled, lato, lato);
    }

    public void setLato(double lato){
        this.setWidth(lato);
        this.setLength(lato);
    }

    public double getLato(){
        return this.getLength();
    }

    public String toString(){
        return "Color: " +this.getColor()+ "\nFilled: " +this.getFill()+ "\nLato: " +this.getLato();
    }

    //Non ho fatto l'override per l'area e il perimetro perché sono uguali al rettangolo
}