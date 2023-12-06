package prg.Esercitazioni.esercitazione3.es6;
public class Persona{
    //variabili nome, cognome età
    private String nome;
    private String cognome;
    private int eta;

    //implementare i costruttori e metodi che si ritengono necessari
    public Persona(String nome, String cognome, int eta){
        this.setNome(nome);
        this.setCognome(cognome);
        this.setEta(eta);
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }

    public void setCognome(String cognome){
        this.cognome = cognome;
    }
    public String getCognome(){
        return this.cognome;
    }

    public void setEta(int eta){
        this.eta = eta;
    }
    public int getEta(){
        return this.eta;
    }

    //metodo toString: restituisce le informazioni
    public String toString(){
        return this.nome + " " + this.cognome + " " + this.eta + " anni";
    }

    //metodo equals verifica se due persone sono uguali
    public boolean equals(Persona p){
        if(this.nome.equals(p.getNome()) && this.cognome.equals(p.getCognome()) && this.eta == p.getEta()){
            return true;
        }
        return false;
    }
}