package prg.Esercitazioni.esercitazione5.es3;
import java.util.Scanner;
import prg.Esercitazioni.esercitazione5.es3.Razionali;
public class TestRazionali{
    public static void main(String args[]){

        System.out.println("\n\tTEST NUMERI RAZIONALI\n");
        
        //Leggere da tastiera un paio di oggetti Razionali
        Razionali n1 = scannerRazionali();
        Razionali n2 = scannerRazionali();

        //calcolare somma
        Razionali razionaleSomma = Razionali.somma(n1,n2);

        //calcolare sottrazione
        Razionali razionaleSottrazione = Razionali.sottrazione(n1, n2);

        //calcolare il prodotto
        Razionali razionaleProdotto = Razionali.prodotto(n1, n2);

        //calcolare la divisione
        try{
            Razionali razionaleQuoziente = Razionali.quoziente(n1, n2);
           
            //stampare con toString
            System.out.println("\nI numeri che hai scelto sono: " + n1.toString() + " e " + n2.toString());
            System.out.println("\nLa somma dei numeri razionali è: " + razionaleSomma.toString());
            System.out.println("\nLa differenza tra i numeri razionali è: " + razionaleSottrazione.toString());
            System.out.println("\nIl prodotto tra i numeri razionali è: " + razionaleProdotto.toString());
            System.out.println("\nIl quoziente tra i numeri razionali è: " + razionaleQuoziente.toString());
        
        } catch (ArithmeticException exc){
            System.out.println("Non è possibile effettuare una divisione per zero");
        }


    }
    public static Razionali scannerRazionali(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserisci il numeratore ");
        int numeratoreTmp = scanner.nextInt();
        System.out.print("Inserisci il denominatore ");
        try{
            int denominatoreTmp = scanner.nextInt();
            Razionali n = new Razionali(numeratoreTmp, denominatoreTmp);
            return n;
        } catch (IllegalArgumentException exc){
            System.out.println(exc);
        }
        Razionali n = new Razionali(numeratoreTmp, 1);
        return n;
    }
}