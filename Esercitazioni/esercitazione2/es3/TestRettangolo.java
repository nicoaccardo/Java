public class TestRettangolo{
    public static void main(String args[]){

        Rettangolo r1 = new Rettangolo();
        r1.base=5;
        r1.altezza=3;
        Rettangolo r2 = new Rettangolo();
        r2.base=4;
        r2.altezza=5;

        System.out.println("Il primo rettangolo di base " +r1.base+ " e altezza " +r1.altezza+ " ha:");
        System.out.println("Perimetro = " +r1.perimetro());
        System.out.println("Area = " +r1.area());

        System.out.println("\nIl secondo rettangolo di base " +r2.base+ " e altezza " +r2.altezza+ " ha:");
        System.out.println("Perimetro = " +r2.perimetro());
        System.out.println("Area = " +r2.area());
    }
}