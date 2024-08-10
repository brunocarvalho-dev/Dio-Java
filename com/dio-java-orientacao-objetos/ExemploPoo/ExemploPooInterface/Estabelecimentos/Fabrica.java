package Estabelecimentos;

import Equipamentos.Impressoras.Deskjet;
import Equipamentos.Impressoras.Impressora;
import Equipamentos.Impressoras.Laserjet;
import Equipamentos.Multifuncionais.EquipamentoMultifuncional;

/**
 * <h1>Fabrica</h1>
 * Programa desenvolvido, para simular o <b>INTERFACE</b> utilizando diversas
 * interfaces para <b>IMPLEMENTAR</b> diferentes metódos;
 * 
 * @author BrunoCarvalho
 * @version 1.0
 * @since Codigo para aprendizado da utilização de <b>Interfaces</b>,
 *        <b>Abstração</b> e <b>Polimorfismo</b>
 *        programa Dio - java
 */
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
