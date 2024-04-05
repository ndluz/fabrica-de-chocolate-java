package entities;

public class Maquina {
	private ConfiguracaoMaquina maquina;
	
	public Maquina() {}
	
	public void fabricar(ConfiguracaoMaquina config) {
		this.maquina = config;
	}
	
	public void fabricar(int quantidade) {
		this.maquina.produzir(quantidade);
	}

	public ConfiguracaoMaquina getMaquina() {
		return maquina;
	}

	public void setMaquina(ConfiguracaoMaquina maquina) {
		this.maquina = maquina;
	}
}
