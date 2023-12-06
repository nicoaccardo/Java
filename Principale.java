package prg.Esercitazioni.esercitazione3.es6;
public class Principale{
    public static void main(String args[]){

        //istanziare due oggetti persona1 e persona2
        Persona persona1 = new Persona("Nicolò", "Accardo", 20);
        Persona persona2 = new Persona("Alena", "Curatolo", 19);

        System.out.println(persona1.toString());
        System.out.println(persona2.toString());

        if(persona1.equals(persona2)){
            System.out.println("Uguali");
        } else {
            System.out.println("Diversi");
        }

        //dichiarare persona3 che punta a persona1
        Persona persona3 = persona1;

        persona3.setNome("Nick");

        System.out.println(persona1.toString());
        System.out.println(persona2.toString());        
        System.out.println(persona3.toString());        
    }
}