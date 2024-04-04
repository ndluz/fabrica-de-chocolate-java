package entities;

import java.util.ArrayList;
import java.util.List;

public class ConfiguracaoBombom extends ConfiguracaoMaquina{
private Bombom bombom;
	
	public ConfiguracaoBombom(Bombom bombom) {
		this.bombom = bombom;
	}
	
	private Bombom setBombom(Bombom bombom) {
		System.out.println(bombom.toString());
		return bombom;
	}

	@Override
	public List<Chocolate> produzir(int quantidade) {
		List<Chocolate> bombom = new ArrayList<>();
		for(int i = 0; i < quantidade;  i++) {
			bombom.add(this.setBombom(this.bombom));
		}
		return bombom;
	}
	

}
