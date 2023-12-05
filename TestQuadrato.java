package prg.Esercitazioni.esercitazione2.es2;
public class TestQuadrato {
    public static void main(String args[]) {
        Quadrato q = new Quadrato(5);
        // q.lato = 5;
        System.out.println("Il perimetro di un quadrato di lato " +q.lato+ " è: " + q.perimetro());
        System.out.println("L'area di un quadrato di lato " +q.lato+ " è: " + q.area());
    }
}