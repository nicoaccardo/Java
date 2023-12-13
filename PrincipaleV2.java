package prg.Esercitazioni.esercitazione4.es2;
import prg.Esercitazioni.esercitazione3.es6.Persona;
import java.util.ArrayList;
public class PrincipaleV2 {
    public static void main(String args[]){

        //crea una lista vuota di oggetti Persona
        ArrayList<Persona> miaLista = new ArrayList<>();

        //crea alcuni oggetti Persona e aggiungili con il metodo add
        Persona p1 = new Persona("Nicolò","Accardo",20);
        miaLista.add(p1);
        Persona p2 = new Persona("Alena","Curatolo",19);
        miaLista.add(p2);
        Persona p3 = new Persona("Angelo","Accardo",52);
        miaLista.add(p3);
        Persona p4 = new Persona("Francesca","Di Giovanni",49);
        miaLista.add(p4);
        Persona p5 = new Persona("Giacomo","Accardo",17);
        miaLista.add(p5);

        //verifica la dimensione della lista con il metodo size
        System.out.println("La mia lista contiene " + miaLista.size() + " elementi");

        //prendi l'i-esimo elemento dalla lista con il metodo get e stampalo (ho aggiunto la randomizzazione)
        System.out.println("\nPersona random: " + miaLista.get((int)(Math.random()*10 % miaLista.size())));

        //elimina l'i-esimo elemento dalla lista con il metodo remove (ho aggiunto la randomizzazione)
        if(miaLista.remove(miaLista.get((int)(Math.random()*10 % miaLista.size())))){
            System.out.println("\nHo eliminato una persona random");
        } else { System.out.println("\nErrore in fase di eliminazione"); }

        //stampa il contenuto della lista usando un ciclo for oppure un ciclo for migliorato(foreach)
        System.out.println("\nNella lista sono presenti:");
        for(int i=0; i<miaLista.size(); i++){
            System.out.println(miaLista.get(i));
        }

        //Cancella l'intera lista con il metodo clear e verifica che sia effettivamente svuotata
        miaLista.clear();
        if(miaLista.size()==0){
            System.out.println("\nLista cancellata");
        }
        
    }
}