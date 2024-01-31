package prg.Esercitazioni.esercitazione9.es4;

public class TestStack{
      public static void main (String args[]){

            Stack stack = new Stack();

            try{
                  stack.push("Giuseppe");
                  stack.push("Alberto");
                  stack.push("Nicolò");
                  stack.push("Alena");
            } catch (OutOfStackException exc){
                  System.out.println(exc);
            }

            System.out.println(stack);

            System.out.println(stack.pop());

            System.out.println(stack.isEmpty());
            System.out.println(stack.isFull());

            System.out.println(stack);
      }
}