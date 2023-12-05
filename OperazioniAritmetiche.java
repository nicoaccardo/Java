package prg.Esercitazioni.esercitazione2.es1;
public class OperazioniAritmetiche {
    public static void main(String args[]) {

        //Divisione
        int a = 5, b = 3;
        float r1 = a/b;

        //Moltiplicazione
        char c = 'a';
        short s = 5000;
        int r2 = c*s;

        //Somma
        int i = 6;
        float f = 3.14F;
        float r3 = i + f;

        //Sottrazione
        float r4 = r1-r2-r3;

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);

    }
}