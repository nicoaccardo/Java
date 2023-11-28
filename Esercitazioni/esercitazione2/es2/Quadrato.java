public class Quadrato {
    public Quadrato(int x){
        lato = x;
    }
    
    int lato;

    public int perimetro(){
        return lato*4;
    }

    public int area(){
        return lato*lato;
    }
}