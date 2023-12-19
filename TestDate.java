package prg.Esercitazioni.esercitazione5.es4;
import prg.Esercitazioni.esercitazione5.es4.Date;
public class TestDate{
    public static void main(String args[]){
        Date casuale = new Date();
        Date oggi = new Date(19, 12, 2023);
        Date primoAnno = new Date(332, 2024);
        Date ieri = new Date(18, "Dicembre", 2023);

        System.out.println(casuale);
        System.out.println(oggi);
        System.out.println(primoAnno);
        System.out.println(ieri);

        System.out.println(oggi.equals(ieri));
    }
}