package prg.Esercitazioni.esercitazione9.es4;
import java.util.ArrayList;
import java.lang.StringBuilder;

public class Stack {

      private ArrayList<String> pila = new ArrayList<>(10);

      public Stack(){}

      public void push(String... s){
            for(String str : s){
                  if( pila.size() < 10){
                        pila.add(str);
                  } else {
                        throw new OutOfStackException();
                  }
            }
      }

      public String pop(){
            return pila.remove(pila.size()-1);
      }

      public boolean isEmpty(){
            return pila.isEmpty();
      }

      public boolean isFull(){
            if( pila.size() == 10){
                  return true;
            } else {
                  return false;
            }
      }

      @Override
      public String toString(){
            StringBuilder sb = new StringBuilder();
            for(String s : pila){
                  sb.append(s.toString() + ", ");
            }

            return sb.toString();
      }
}