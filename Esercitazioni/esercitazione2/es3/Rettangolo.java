/**Classe Rettangolo che calcola il perimetro e l'area */
public class Rettangolo {
    int base, altezza;

    /**Il perimetro del rettangolo è il doppio della somma della base e dell'altezza */
    public int perimetro(){
        return (base+altezza)*2;
    }

    /**L'area del rettangolo è il prodotto tra la base e l'altezza */
    public int area(){
        return base*altezza;
    }

}