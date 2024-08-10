package com.lanchonete.atendimento.cozinha;

/**
 * <h1>Cliente</h1>
 * Programa desenvolvido, para simular o <b>ENCAPSULAMENTO</b> para manter o
 * sistema mais protegido;
 * <p>
 * <b>Private</b>: A única classe que tem acesso ao atributo é a própria classe
 * que o
 * define, ou seja, se uma classe Pessoa declara um atributo privado chamado
 * nome, somente a classe Pessoa terá acesso a ele.
 * <p>
 * <b>Default</b>: Tem acesso a um atributo default (identificado pela ausência
 * de
 * modificadores) todas as classes que estiverem no mesmo pacote que a classe
 * que possui o atributo.
 * <p>
 * <b>Protected</b>: Esse é o que pega mais gente, ele é praticamente igual ao
 * default,
 * com a diferença de que se uma classe (mesmo que esteja fora do pacote)
 * estende da classe com o atributo protected, ela terá acesso a ele. Então o
 * acesso é por pacote e por herança.
 * <p>
 * <b>Public</b>: Torna visível para todas as classes
 * <p>
 * @author BrunoCarvalho
 * @version 1.0
 * @since Codigo para aprendizado da utilização de <b>Modificadores de
 *        Acesso</b>,
 *        programa Dio - java
 */

public class Almoxarife {
	private void controlarEntrada() {
		System.out.println("CONTROLANDO A ENTRADA DOS ITENS");
	}

	private void controlarSaida() {
		System.out.println("CONTROLANDO A SAIDA DOS ITENS");
	}

	void entregarIngredientes() {
		System.out.println("ENTREGANDO INGREDIENTES");
		controlarSaida();
	}

	void trocarGas() {
		System.out.println("ALMOXARIFE TROCANDO O GÁS");
	}
}
