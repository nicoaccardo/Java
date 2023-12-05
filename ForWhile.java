package prg.Esercitazioni.esercitazione1.es4;
public class ForWhile{
    public static void main(String args[]){

        //ciclo for che somma i numeri da 50 a 100
        int somma = 0;
        for(int i=50; i <= 100; i++){
            somma+=i;
        }
        System.out.println("La somma dei numeri da 50 a 100 è: " + somma);

        //ciclo while che stampa i numeri pari da 10 a 0 utilizzando l'operatore di decremento --
        int j = 10;
        while(j>=0){
            if(j%2==0){
                System.out.print(j + " ");
            }
        j--;
        }
        System.out.println();
    }
}