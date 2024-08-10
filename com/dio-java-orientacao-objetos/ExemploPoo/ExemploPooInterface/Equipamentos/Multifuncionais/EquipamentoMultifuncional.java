package Equipamentos.Multifuncionais;

import Equipamentos.Copiadoras.Copiadora;
import Equipamentos.Digitalizadoras.Digitalizadora;
import Equipamentos.Impressoras.Impressora;

/**
 * <h1>Fabrica</h1>
 * Programa desenvolvido, para simular a utilização das <b>INTERFACE</b> utilizando diversas
 * interfaces para <b>IMPLEMENTAR</b> diferentes metódos;
 * <p>
 * Utilizando <b>IMPLEMENTS</b> é possivél implementar métodos das classes
 * <b>COPIADORA</b>, <b>IMPRESSORA</b> e <b>DIGITALIZADORA</b>,
 * <p>
 * Com a utilização desse método torna-se obrigatório a utilização das
 * <b><i>@Override</i><b>, para implementação dos metódos;
 * <p>
 * 
 * @author BrunoCarvalho
 * @version 1.0
 * @since Codigo para aprendizado da utilização de <b>Interfaces</b>,
 *        <b>Abstração</b> e <b>Polimorfismo</b>
 *        programa Dio - java
 */
public class EquipamentoMultifuncional implements Copiadora, Impressora, Digitalizadora {
	@Override
	public void Copiar() {
		System.out.println("Copiando via Multifuncional");

	}

	@Override
	public void Digitalizar() {
		System.out.println("Digitalizando via Multifuncional");

	}

	@Override
	public void imprimir() {
		System.out.println("Imprimindo via Multifuncional");

	}
}
