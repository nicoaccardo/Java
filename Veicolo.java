package prg.Esercitazioni.esercitazione8;

public abstract class Veicolo {
	
	private final double[] posizioneIniziale = new double[2];
	private final double[] velocitaIniziale = new double[2];
	private double[] accelerazione = new double[2];
	
	private double[] posizioneFinale = new double[2];
	
	public abstract double[] muovi(double t);
	
	
	public double[] getPosizioneIniziale() {
		return posizioneIniziale;
	}
	
	public void setPosizioneIniziale(double x, double y) {
		posizioneIniziale[0] = x;
		posizioneIniziale[1] = y;
	}
	
	public double[] getVelocitaIniziale() {
		return velocitaIniziale;
	}
	
	public void setVelocitaIniziale(double vX, double vY) {
		velocitaIniziale[0] = vX;
		velocitaIniziale[1] = vY;
	}
	
	public double[] getAccelerazione() {
		return accelerazione;
	}
	
	public void setAccelerazione(double aX, double aY) {
		accelerazione[0] = aX;
		accelerazione[1] = aY;
	}
	
	public void setPosizioneFinale(double x, double y) {
		posizioneFinale[0] = x;
		posizioneFinale[1] = y;
		
	}
	
	public double[] getPosizioneFinale() {
		return posizioneFinale;
	}
	
	@Override
	public String toString() {
		return "posizione: [" + posizioneFinale[0] + ", " + posizioneFinale[1] + "]";
	}
}