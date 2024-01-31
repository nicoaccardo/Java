package prg.Esercitazioni.esercitazione9.es4;

public class OutOfStackException extends RuntimeException {

      public OutOfStackException(){
            super("Spazio in pila esaurito");
      }

      @Override
      public String toString(){
            return getMessage();
      }
}