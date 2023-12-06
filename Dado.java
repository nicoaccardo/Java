package prg.Esercitazioni.esercitazione3.es5;
public class Dado{
    public int lancia(){
        /*Spiegazione sul perché (*100 % 6) +1
            moltiplicando per 100 trovo sicuramente un numero che sia più grande di 6 e quindi divisibile per 6
            poi faccio il resto con 6 perchè il resto sarà sicuramente compreso tra lo 0 e il 5
            ed infine sommo 1 per avere un numero compreso tra 1 e 6
        */
        int risultato = (int) ((Math.random()*100 % 6)+1);
        return risultato;
    }
}