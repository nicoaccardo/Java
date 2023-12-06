package prg.Esercitazioni.esercitazione3.es3;
public class TestMatematica{
    public static void main(String args[]){

        //Istanziare un oggetto miaCalcolatrice
        Calcolatrice miaCalcolatrice = new Calcolatrice();

        //utilizzare miaCalcolatrice per generare 3 vettori
        //v1 e v2 di dimensione 3 e v3 di dimensione 5
        double[] v1 = miaCalcolatrice.generaVettore(3);
        double[] v2 = miaCalcolatrice.generaVettore(3);
        double[] v3 = miaCalcolatrice.generaVettore(5);
        
        System.out.println("Vettore 1");
        miaCalcolatrice.stampaVettore(v1);
        System.out.println("Vettore 2");
        miaCalcolatrice.stampaVettore(v2);
        System.out.println("Vettore 3");
        miaCalcolatrice.stampaVettore(v3);

        //Sommare v1 e v2, sommare v1 e v3, concatenare v1 e v3. Stampare il tutto
        double[] sommaVettore1Vettore2 = miaCalcolatrice.sommaVettori(v1, v2);
        double[] sommaVettore1Vettore3 = miaCalcolatrice.sommaVettori(v1, v3);
        double[] vettore1Vettore3Concatenato = miaCalcolatrice.concatenaVettori(v1, v3);

        System.out.println("Vettore somma 1-2");
        miaCalcolatrice.stampaVettore(sommaVettore1Vettore2);
        System.out.println("Vettore somma 1-3");
        miaCalcolatrice.stampaVettore(sommaVettore1Vettore3);
        System.out.println("Vettore concatenato 1-3");
        miaCalcolatrice.stampaVettore(vettore1Vettore3Concatenato);

        //generare 3 matrici: m1 m2 m3 di dimensione 3x5
        double[][] m1 = miaCalcolatrice.generaMatrice(3, 5);
        double[][] m2 = miaCalcolatrice.generaMatrice(3, 5);
        double[][] m3 = miaCalcolatrice.generaMatrice(3, 5);

        //sommare m1 e m2, m1 e m3 e stampare i risultati
        double[][] sommaM1M2 = miaCalcolatrice.sommaMatrici(m1, m2);
        double[][] sommaM1M3 = miaCalcolatrice.sommaMatrici(m1, m3);
        System.out.println("Matrice somma m1-m2");
        miaCalcolatrice.stampaMatrice(sommaM1M2);
        System.out.println("Matrice somma m1-m3");
        miaCalcolatrice.stampaMatrice(sommaM1M3);

    }
}