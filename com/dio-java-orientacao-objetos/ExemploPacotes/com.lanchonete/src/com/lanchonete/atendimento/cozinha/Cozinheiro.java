package com.lanchonete.atendimento.cozinha;

/**
 * <h1>Cozinheiro</h1>
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
public class Cozinheiro {
	public void adicionarLancheNoBalcao() {
		System.out.println("ADICIONANDO LANCHE NATURAL HAMBÚRGUER NO BALCÃO");
	}

	public void adicionarSucoNoBalcao() {
		System.out.println("ADICIONANDO SUCO NO BALCÃO");
	}

	public void adicionarComboNoBalcao() {
		adicionarLancheNoBalcao();
		adicionarSucoNoBalcao();
	}
	
	private void prepararLanche() {
		selecionarIngredientesLanche();
		lavarIngredientes();
		fritarIngredientesLanche();
		System.out.println("PREPARANDO LANCHE TIPO HAMBÚRGUER");
	}
	private void prepararVitamina() {
		selecionarIngredientesVitamina();
		lavarIngredientes();
		prepararVitamina();
		System.out.println("PREPARANDO SUCO");
	}
	private void prepararCombo() {
		prepararLanche();
		prepararVitamina();
	}
	private void selecionarIngredientesLanche() {
		System.out.println("SELECIONADO O PÃO, SALADA, OVO E CARNE");
	}
	private void selecionarIngredientesVitamina() {
		System.out.println("SELECIONADO FRUTA, LEITE E SUCO");
	}
	private void lavarIngredientes() {
		System.out.println("LAVANDO INGREDIENTES");
	}
	private void baterVitaminaLiquidificador() {
		System.out.println("BATENDO VITAMINA NO LIQUIDIFICADOR");
	}
	private void fritarIngredientesLanche() {
		System.out.println("FRITANDO A CARNE E OVO PARA O HAMBÚRGUER");
	}

	private void pedirParaTrocarGas(Almoxarife meuAmigo) {
			meuAmigo.trocarGas();
	}
	private void pedirIngredientes(Almoxarife almoxarife) {
		almoxarife.entregarIngredientes();
	}
}
