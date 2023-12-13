package prg.Libro.esempi;
import java.awt.*;
public class FinestraConPulsante{
    public static void main(String args[]){
        Frame finestra = new Frame("Titolo");
        Button pulsante = new Button("Cliccami");
        finestra.add(pulsante);
        finestra.setSize(200,100);
        finestra.setVisible(true);
    }
}