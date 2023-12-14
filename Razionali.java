package prg.Esercitazioni.esercitazione5.es3;
public class Razionali{
    // I numeri razionali sono quei numeri che si ottengono dividendo due numeri interi e hanno particolari proprietà
    private int numeratore;
    private int denominatore;

    public Razionali(int numeratore, int denominatore){
        this.setNumeratore(numeratore);
        this.setDenominatore(denominatore);
    }

    public void setNumeratore(int numeratore){
        this.numeratore = numeratore;
    }

    public void setDenominatore(int denominatore){
        this.denominatore = denominatore;
    }

    public int getNumeratore(){
        return this.numeratore;
    }

    public int getDenominatore(){
        return this.denominatore;
    }

    public String toString(){
        return getNumeratore() + "/" + getDenominatore();
    }

    public static Razionali somma(Razionali n1, Razionali n2){
        int denominatoreSomma = (n1.getDenominatore() * n2.getDenominatore());
        int numeratoreSomma = (denominatoreSomma / n1.getDenominatore() * n1.getNumeratore()) + (denominatoreSomma / n2.getDenominatore() * n2.getNumeratore());
        Razionali razionaleSomma = new Razionali(numeratoreSomma, denominatoreSomma);
        return razionaleSomma;
    }

    public static Razionali sottrazione(Razionali n1, Razionali n2){
        int denominatoreSottrazione = (n1.getDenominatore() * n2.getDenominatore());
        int numeratoreSottrazione = (denominatoreSottrazione / n1.getDenominatore() * n1.getNumeratore()) - (denominatoreSottrazione / n2.getDenominatore() * n2.getNumeratore());
        Razionali razionaleSottrazione = new Razionali(numeratoreSottrazione, denominatoreSottrazione);
        return razionaleSottrazione;
    }

    public static Razionali prodotto(Razionali n1, Razionali n2){
        int numeratoreProdotto = n1.getNumeratore() * n2.getNumeratore();
        int denominatoreProdotto = n1.getDenominatore() * n2.getDenominatore();
        Razionali razionaleProdotto = new Razionali(numeratoreProdotto, denominatoreProdotto);
        return razionaleProdotto;
    }

    public static Razionali quoziente(Razionali n1, Razionali n2){
        int numeratoreQuoziente = n1.getNumeratore() * n2.getDenominatore();
        int denominatoreQuoziente = n1.getDenominatore() * n2.getNumeratore();
        Razionali razionaleQuoziente = new Razionali(numeratoreQuoziente, denominatoreQuoziente);
        return razionaleQuoziente;
    }

}