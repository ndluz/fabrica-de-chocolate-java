package entities;

public class OvoPascoa extends Chocolate {
	private int tamanho;
	private boolean brinde;
	
	public OvoPascoa(double cacau, double leite, double acucar, String recheio, int tamanho, boolean brinde) {
		super(cacau, leite, acucar, recheio);
		this.tamanho = tamanho;
		this.brinde = brinde;
	}
	
	
	@Override
	public String toString() {
		return super.toString() + "Tamanho = " + this.tamanho + ", BRINDE" + this.brinde; 
	}
}
