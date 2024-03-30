package entities;

public class Bombom extends Chocolate {
	private String cobertura;
	
	public Bombom(double cacau, double leite, double acucar, String recheio, String cobertura) {
		super(cacau, leite, acucar, recheio);
		this.cobertura = cobertura;
	}

	@Override
	public String toString() {
		return super.toString() + ", COBERTURA =  " + this.cobertura;
	}
}
