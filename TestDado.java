package prg.Esercitazioni.esercitazione3.es5;
public class TestDado{
    public static void main(String args[]){
        Dado dado1 = new Dado();
        Dado dado2 = new Dado();

        int[] numeriUsciti = new int[13];

        for(int i=0; i<100; i++){
            int risultatoSomma = dado1.lancia()+dado2.lancia();
            numeriUsciti[risultatoSomma]++;
            if(risultatoSomma==12){
                System.out.println("È uscito 12!");
            }
        }

        int combinazioneFrequente = numeriUsciti[2];
        int indiceCombinazione = 2;

        for(int i=3; i<13; i++){
            if(numeriUsciti[i]>combinazioneFrequente){
                combinazioneFrequente=numeriUsciti[i];
                indiceCombinazione=i;
            }
        }

        for(int i=2; i<13; i++){
            System.out.println("La combinazione " + i + " è uscita " + numeriUsciti[i] + " volte");
        }

        System.out.println("La combinazione più frequente è: " +indiceCombinazione);
    }
}