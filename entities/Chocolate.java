package entities;

public class Chocolate {
	private double cacau;
	private double leite;
	private double acucar;
	
	private String recheio;

	public Chocolate() {}
	
	public Chocolate(double cacau, double leite, double acucar, String recheio) {
		this.cacau = cacau;
		this.leite = leite;
		this.acucar = acucar;
		this.recheio = recheio;
	}

	@Override
	public String toString() {
		return "Chocolate CACAU = " + this.cacau * 100 + 
				"%, LEITE = " + this.leite * 100 + "%, AÇÚCAR = " 
				+ acucar * 100 + "%, RECHEIO = " + recheio.toUpperCase();
	}
}
