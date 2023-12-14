package prg.Esercitazioni.esercitazione4.es5;
import prg.Esercitazioni.esercitazione4.es5.Punto;
import java.util.Scanner;
public class TestPunto{
    public static void main (String args[]){

        Scanner scanner = new Scanner(System.in);
        
        //Crea due punti con dati inseriti da tastiera dall'utente (nextDouble)
        System.out.println("Inserisci le coordinate del primo punto (x y)");
        Punto p1 = new Punto(scanner.nextDouble(), scanner.nextDouble());
        System.out.println("Inserisci le coordinate del secondo punto (x y)");
        Punto p2 = new Punto(scanner.nextDouble(), scanner.nextDouble());

        //Dati i due punti, ne calcola la loro distanza
        System.out.println("La distanza tra i due punti è " + p1.distanza(p2));

        //Dati i due punti, determina il punto medio del segmento che li unisce
        System.out.println("Il punto medio ha coordinate: " + (p1.getX()+p2.getX())/2 + "x " + (p1.getY()+p2.getY())/2 + "y");

        //Dati i due punti verifica se sono uguali (equals)
        if(p1.equals(p2)){
            System.out.println("Sono uguali");
        } else {
            System.out.println("Sono diversi");
        }

    }
}