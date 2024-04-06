package entities;

import java.util.List;
import java.util.ArrayList;

public class ConfiguracaoOvoPascoa extends ConfiguracaoMaquina {
	private OvoPascoa ovoPascoa;
	
	public ConfiguracaoOvoPascoa(OvoPascoa op) {
		this.ovoPascoa = op;
	}
	
	private OvoPascoa setOvo(OvoPascoa ovoPascoa) {
		System.out.println(ovoPascoa.toString());
		return ovoPascoa;
	}

	@Override
	public List<Chocolate> produzir(int quantidade) {
		List<Chocolate> ovosPascoa = new ArrayList<>();
		for(int i = 0; i < quantidade;  i++) {
			System.out.print(i+1 +": produzindo OvoPascoa: ");
			ovosPascoa.add(this.setOvo(this.ovoPascoa));
		}
		return ovosPascoa;
	}
}
