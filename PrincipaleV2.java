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

        //verifica la dimensione della lista con il metodo size
        System.out.println(miaLista.size());

        //prendi l'i-esimo elemento dalla lista con il metodo get e stampalo
        System.out.println(miaLista.get(1));

        //elimina l'i-esimo elemento dalla lista con il metodo remove
        miaLista.remove(1);

        //stampa il contenuto della lista usando un ciclo for oppure un ciclo for migliorato(foreach)
        for(int i=0; i<miaLista.size(); i++){
            System.out.println(miaLista.get(i));
        }

        //Cancella l'intera lista con il metodo clear e verifica che sia effettivamente svuotata
        miaLista.clear();
        System.out.println(miaLista.size());
        
    }
}