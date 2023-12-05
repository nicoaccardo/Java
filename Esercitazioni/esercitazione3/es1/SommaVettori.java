public class SommaVettori{
    public static void main(String args[]){
        
        double[] vettore1 = new double[10];
        double[] vettore2 = new double[10];
        for(int i=0; i<10; i++){
            vettore1[i] = (Math.random()*1000);
            vettore2[i] = (Math.random()*1000);
        }

        int[] vettoresomma = new int[10];

        for(int i=0; i<10; i++){
            vettoresomma[i] = (int) (vettore1[i] + vettore2[i]);
        }

        for(int j=0; j<10; j++){
            System.out.println(vettoresomma[j]);
        }
    }
}

