package prg.Esercitazioni.esercitazione6.es1;
public class IntegerSet{

    //creare un array di booleani compreso tra 0 e 99
    //L'elemento dell'array a[i] è true se l'intero i è contenuto nell'insieme
    private boolean[] set = new boolean[100];

    //Il costruttore di default inizializza un insieme all'insieme vuoto, il cui array contiene soltanto false
    public IntegerSet(){}

    public IntegerSet(int... k){
        for(int tmp : k){
            if(tmp >= 0 && tmp <100){
                this.insertElement(tmp);
            } else {
                System.out.println("Errore: l'intero deve essere compreso tra 0 e 99");
            }
        }
    }

    //unionOfIntegerSet crea un terzo insieme che è l'unione di due insiemi esistenti
    public IntegerSet unionOfIntegerSet(IntegerSet set2){
        IntegerSet unionSet = new IntegerSet();
        for(int i=0; i<100; i++){
            if(this.set[i] || set2.set[i]){
                unionSet.set[i]=true;
            }
        }
        return unionSet;
    }

    //intersectionOfIntegerSet crea un terzo insieme che è l'intersezione di due insiemi esistenti
    public IntegerSet intersectionOfIntegerSet (IntegerSet set2){
        IntegerSet interectionSet = new IntegerSet();
        for (int i=0; i<100; i++){
            if(this.set[i] && set2.set[i]){
                interectionSet.set[i]=true;
            }
        }
        return interectionSet;
    }

    //insertElement inserisce un nuovo intero k nell'insieme (imposta a[k] a true)
    public void insertElement(int... k) {
        for(int tmp : k){
            try {
                if(this.set[tmp]==true){
                    System.out.println("L'intero " +tmp+ " è già presente nell'insieme");
                } else {
                    this.set[tmp] = true;
                }
            } catch (ArrayIndexOutOfBoundsException exc) {
                System.out.println("Errore: l'intero deve essere compreso tra 0 e 99");
            }
        }
    }

    //deleteElement elimina dall'insieme intero m (imposta a[m] false)
    public void deleteElement(int... k){
        for(int tmp : k){
            if(this.set[tmp]){
                this.set[tmp]=false;
            } else {
                System.out.println("L'elemento " +tmp+ " non è presente nella lista");
            }
        }
    }

    //toString()
    public String toString(){
        StringBuilder output = new StringBuilder();

        for(int i=0; i<100; i++){
            if(this.set[i]){
                output.append(i + " ");
            }
        }

        if(output.length()>0){
            return output.toString();
        } else {
            return "Insieme vuoto";
        }
    }

}