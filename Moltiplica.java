package prg.Esercitazioni.esercitazione1.es3;
import java.util.Scanner;
public class Moltiplica{
    public static void main(String args[]){
        Scanner keyboardScanner = new Scanner(System.in);
        System.out.println("Moltiplicatore v0.1");
        System.out.println("Inserisci il primo numero: ");
        int input1 = keyboardScanner.nextInt();
        System.out.println("Inserisci il secondo numero: ");
        int input2 = keyboardScanner.nextInt();
        System.out.print("Risultato: ");
        System.out.println(input1 * input2);
    }
}