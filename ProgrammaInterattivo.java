package prg.Esercitazioni.esercitazione4.es1;
import java.util.Scanner;
import java.util.ArrayList;
public class ProgrammaInterattivo{
    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);
        String stringa = "";
        
        ArrayList<String> paroleVietate = new ArrayList<>();
		paroleVietate.add("alpha");
		paroleVietate.add("beta");
		paroleVietate.add("gamma");
		paroleVietate.add("delta");
		paroleVietate.add("epsilon");
		paroleVietate.add("kappa");
		paroleVietate.add("lambda");
		paroleVietate.add("sigma");
		paroleVietate.add("omega");

        System.out.println("Digita qualcosa e batti enter, oppure " + "scrivi \"fine\" per terminare il programma.\nL'utilizzo delle parole: alfa, beta, gamma, delta, epsilon, kappa, lamda, sigma e omega non stamperà nulla");
            while(!(stringa = scanner.next()).equals("fine")){
                if(!(paroleVietate.contains(stringa))){
                    System.out.println("Hai digitato " + stringa.toUpperCase()+"!");
                }
            }
        System.out.println("Fine programma!");
    }
}

//parole da memorizzare: alfa, beta, gamma, delta, epsilon, kappa,lamda, sigma, omega