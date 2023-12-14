package prg.Esercitazioni.esercitazione4.es4;
import prg.Esercitazioni.esercitazione3.es6.Persona;
import java.util.ArrayList;
import java.util.Scanner;
public class ProgrammaInterattivoV2{
    public static void main(String args[]){

        ArrayList<Persona> lista = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        // String flag = new String();
        int sceltaUtente=0;

        //menu
        do {
            stampaMenu();
            sceltaUtente = scanner.nextInt();

            switch(sceltaUtente) {

                //inserire una nuova persona nella lista con dati inseriti dall'utente
                case 1:
                    System.out.print("Inserisci il nome: ");
                    String nomeTmp = scanner.next();
                    System.out.print("Inserisci il cognome: ");
                    String cognomeTmp = scanner.next();
                    System.out.print("Inserisci l'età: ");
                    int etaTmp = scanner.nextInt();

                    Persona persona = new Persona(nomeTmp, cognomeTmp, etaTmp);
                    lista.add(persona);
                    break;

                //cercare una persona nella lista in base al nome
                case 2:
                    System.out.print("Scrivi il nome della persona che vuoi cercare: ");
                    String nomeCercato = scanner.next();
                    boolean trovato = false;
                    
                    for(Persona tmp : lista){
                        if(tmp.getNome().equals(nomeCercato)){
                            System.out.println("\nLa persona è nella lista");
                            trovato = true;
                            break;
                        }
                    }
                    if(!trovato){ System.out.println("\nMi dispiace, la persona non è nella lista"); }
                    break;

                //stampare l'intera lista
                case 3:
                    if(lista.size()==0){
                        System.out.println("\nLa lista è vuota");
                    }
                    for(Persona tmp : lista){
                        System.out.println(tmp.toString());
                    }
                    break;

                //cancellare l'intera lista
                case 4:
                    lista.clear();
                    if(lista.size()==0){
                        System.out.println("\nLista cancellata");
                    }
                    break;

                //esci
                case 0: break;
                default: System.out.println("\nInserimento non valido");
                    break;
            }

        } while(sceltaUtente!=0);
    }

    private static void stampaMenu(){
        System.out.println("\n1) Inserire una nuova persona nella lista");
        System.out.println("2) Cercare una persona in base al nome");
        System.out.println("3) Stampare l'intera lista");
        System.out.println("4) Cancellare l'intera lista");
        System.out.println("Scrivi 0 per terminare il programma");
        System.out.print("Cosa vuoi fare? ");
    }
}