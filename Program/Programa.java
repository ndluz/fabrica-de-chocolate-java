package Program;

import entities.Bombom;
import entities.Chocolate;
import entities.ConfiguracaoBombom;
import entities.ConfiguracaoOvoPascoa;
import entities.Maquina;
import entities.OvoPascoa;

public class Programa {

	public static void main(String[] args) {
		OvoPascoa ovo = new OvoPascoa(0.7, 0.3, 0.1, "morango", 17, false);
		Bombom bombom = new Bombom(0.3, 0.7, 15, "baunilha", "coco");
		Chocolate chocolate = new Chocolate(0.8, 0.2, 0.15, "Amendoim");
		ConfiguracaoOvoPascoa configuracaoOvoPascoa = new ConfiguracaoOvoPascoa(ovo);
		ConfiguracaoBombom configuracaoBombom = new ConfiguracaoBombom(bombom);
		
		Maquina maquina = new Maquina();
		
		System.out.println("######## PRODUÇÃO DE OVOS DE PÁSCOA ################");
		maquina.setMaquina(configuracaoOvoPascoa);
		maquina.fabricar(10);
		
		System.out.println("\n§§§§§§§§§ PRODUÇÃO DE BOMBONS §§§§§§§§§§§§§§§§§");
		maquina.setMaquina(configuracaoBombom);
		maquina.fabricar(5);
		
		System.out.println("\n---------------- PRODUÇÃO DE UM CHOCOLATE ---------------");
		System.out.println(chocolate);
	}

}
