/**Classe Quadrato che calcola il perimetro e l'area */
public class Quadrato {
    /**Costruttore che riceve in input il lato del quadrato */
    public Quadrato(int x){
        lato = x;
    }
    /**lato del quadrato */
    int lato;

    /**Metodo perimetro dato dalla somma dei 4 lati del quadrato */
    public int perimetro(){
        return lato*4;
    }

    /**L'area del quadrato è data dal quadrato del lato */
    public int area(){
        return lato*lato;
    }
}