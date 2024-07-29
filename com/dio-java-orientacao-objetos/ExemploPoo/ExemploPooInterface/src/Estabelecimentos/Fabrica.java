package Estabelecimentos;

import Equipamentos.Impressoras.Deskjet;
import Equipamentos.Impressoras.Impressora;
import Equipamentos.Impressoras.Laserjet;
import Equipamentos.Multifuncionais.EquipamentoMultifuncional;

public class Fabrica {
	public static void main(String[] args) {
		EquipamentoMultifuncional em = new EquipamentoMultifuncional();

		em.imprimir();
		em.Copiar();
		em.Digitalizar();
		
		System.out.println("----------------");
		Impressora impressora1 = new Deskjet();
		
		impressora1.imprimir();
		
		System.out.println("----------------");
		Impressora impressora2 = new Laserjet();
		
		impressora2.imprimir();
		
		System.out.println("----------------");
		
	}
}
