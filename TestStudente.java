package prg.Esercitazioni.esercitazione5.es5;
import prg.Esercitazioni.esercitazione5.es4.Date;
public class TestStudente{
    public static void main(String args[]){

        Date nascitaS1 = new Date(15, 9, 2003);
        Studente s1 = new Studente("Nicolò", "Accardo", nascitaS1, 764229);

        Date nascitaS2 = new Date(03,04,2004);
        Studente s2 = new Studente("Alena", "Curatolo", nascitaS2, 999999);

        System.out.println(s1);
        System.out.println(s2);
    }
}