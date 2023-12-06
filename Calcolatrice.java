package prg.Esercitazioni.esercitazione3.es3;
public class Calcolatrice{

    double[] generaVettore(int Lunghezza){

        double[] vettore = new double[Lunghezza];

        for(int i=0; i<Lunghezza; i++){
            vettore[i]=(Math.random()*1000);
        }

        return vettore;
    }

    double[] sommaVettori(double[] a, double[] b){
        if(a.length==b.length){
            double[] vettoreSomma = new double[a.length];
            for(int i=0; i<a.length; i++){
                vettoreSomma[i] = a[i] + b[i];
            }
            return vettoreSomma;
        } else {
            return a;
        }
    }

    double[] concatenaVettori(double[] a, double[] b){
        double[] vettoreConcatenato = new double[a.length + b.length];
        int i;
        for(i=0; i<a.length; i++){
            vettoreConcatenato[i]=a[i];
        }
        for(int j=0; j<b.length; j++){
            vettoreConcatenato[i] = b[j];
            i++;
        }
        return vettoreConcatenato;
    }

    void stampaVettore(double[] a){
        for(int i=0; i<a.length; i++){
            System.out.println(a[i]);
        }
        System.out.println();
    }

    double[][] generaMatrice(int Riga, int Colonna){
        double[][] matrice = new double[Riga][Colonna];
        for(int i=0; i<Riga; i++){
            for(int j=0; j<Colonna; j++){
                matrice[i][j] = Math.random()*100;
            }
        }
        return matrice;
    }

    double[][] sommaMatrici(double[][] a, double[][] b){
        double[][] matriceSomma = new double[a.length][a[0].length];
        for(int i=0; i<a.length; i++){
            for(int j=0; j<a[0].length; j++){
                matriceSomma[i][j] = a[i][j] + b[i][j];
            }
        }
        return matriceSomma;
    }

    void stampaMatrice(double[][] m){
        for(int i=0; i<m.length; i++){
            for(int j=0; j<m[0].length; j++){
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

}