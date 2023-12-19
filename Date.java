package prg.Esercitazioni.esercitazione5.es4;
public class Date{
    private int giorno;
    private int giornoAlternativo;
    private int mese;
    private String nomeMese;
    private String mesi[] = {"Gennaio", "Febbraio", "Marzo", "Aprile", "Maggio", "Giugno", "Luglio", "Agosto", "Settembre", "Ottobre", "Novembre", "Dicembre"};
    private int[] giorniMese = {31,28,31,30,31,30,31,31,30,31,30,31};
    private int anno;

    public Date(){
        this.setGiorno(01);
        this.setGiornoAlternativo(001);
        this.setMese(01);
        this.setNomeMese("Gennaio");
        this.setAnno(00);
    }

    public Date(int giornoAlternativo, int anno){
        this.setGiornoAlternativo(giornoAlternativo);
        this.setAnno(anno);
    }

    public Date(int giorno, int mese, int anno){
        this.setGiorno(giorno);
        this.setMese(mese);
        this.setAnno(anno);
    }

    public Date(int giorno, String mese, int anno){
        this.setGiorno(giorno);
        this.setNomeMese(mese);
        this.setAnno(anno);
    }

    public void setGiorno(int giorno){
        if(giorno<32 && giorno>0){
            this.giorno = giorno;
        }
    }
    public int getGiorno(){
        return this.giorno;
    }

    public void setGiornoAlternativo(int giorno){
        if(giorno>0 && giorno<366){
            this.giornoAlternativo=giorno;
            this.convertiGiornoAlternativo();
        }
    }
    public int getGiornoAlternativo(){
        return this.giornoAlternativo;
    }

    public void setMese(int mese){
        if(mese>0 && mese<13){
            this.mese = mese;
            setNomeMese(mesi[mese-1]);
        }
    }
    // public int getMese(){
    //     return this.mese;
    // }

    public void setNomeMese(String mese){
        for(int i = 0; i < mesi.length; i++){
            if(mese.equals(mesi[i])){
                this.nomeMese = mese;
            }
        }
    }
    public String getNomeMese(){
        return this.nomeMese;
    }

    public void setAnno(int anno){
        if(anno>0){
            this.anno = anno;
        }
    }
    public int getAnno(){
        return this.anno;
    }

    public String toString(){
        return getGiorno() + " " + getNomeMese() + " " + getAnno();
    }

    private void convertiGiornoAlternativo(){
        if(this.getGiornoAlternativo()>31){
            int contatoreGiorni = this.getGiornoAlternativo(), contatoreMesi = 1;
            for(int i = 0; i < giorniMese.length; i++){
                if(contatoreGiorni > this.giorniMese[i]){
                    contatoreGiorni -= this.giorniMese[i];
                    contatoreMesi++;
                }
                else{
                    this.setGiorno(contatoreGiorni);
                    this.setMese(contatoreMesi);
                }
            }
        }
        else{
            this.setGiorno(this.giornoAlternativo);
            this.setMese(1); 
        }
    }
}