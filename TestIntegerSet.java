package prg.Esercitazioni.esercitazione6.es1;
import prg.Esercitazioni.esercitazione6.es1.IntegerSet;
public class TestIntegerSet{
    public static void main(String args[]){

        IntegerSet set1 = new IntegerSet(1, 2, 5, 29, 53);
        IntegerSet set2 = new IntegerSet(1, 3, 20, 25, 19);

        System.out.println(set1);
        System.out.println(set2);

        set1.insertElement(100);
        System.out.println(set1);

        IntegerSet unionSet = set1.unionOfIntegerSet(set2);
        System.out.println(unionSet);

        IntegerSet interectionSet = set1.intersectionOfIntegerSet(set2);
        System.out.println(interectionSet);
    }
}