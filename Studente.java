package prg.Esercitazioni.esercitazione5.es5;
import prg.Esercitazioni.esercitazione5.es4.Date;
public class Studente {
    private String nome;
    private String cognome;
    Date nascita;
    private long matricola;

    public Studente(String nome, String cognome, Date nascita, long matricola) {
        this.setNome(nome);
        this.setCognome(cognome);
        this.setNascita(nascita);
        this.setMatricola(matricola);
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public void setCognome(String cognome){
        this.cognome = cognome;
    }
    public void setMatricola(long matricola){
        if(matricola > 0){
            this.matricola = matricola;
        }
        else {
            System.out.println("Matricola non valida");
        }
    }
    public void setNascita(Date nascita){
        this.nascita = nascita;
    }

    public String getNome(){
        return this.nome;
    }
    public String getCognome(){
        return this.cognome;
    }
    public long getMatricola(){
        return this.matricola;
    }
    public Date getNascita(){
        return this.nascita;
    }

    public String toString(){
        return this.getNome() + " " + this.getCognome() + " " + this.getNascita() + " " + this.getMatricola();
    }
}