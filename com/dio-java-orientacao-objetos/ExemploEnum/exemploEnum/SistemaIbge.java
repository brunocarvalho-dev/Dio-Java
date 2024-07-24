/**
 * <h1>Sistema IBGE</h1>
 * Programa desenvolvido para instaciar uma classe <b>ENUM</b>; 
 * <p>
 * Desenvolvido para funcionar como
 * referencia para os estados, uma classe que serve para ser instanciada por
 * todo o código, com código repetitivo;
 * @author BrunoCarvalho
 * @version 1.0
 * @since Codigo para aprendizado da utilização da propriedade <b>ENUM</b>, programa Dio - java
 */

 public class SistemaIbge {

	public static void main(String[] args) {
		// imprimindo os estados existentes no enum
		for (EstadoBrasileiro uf : EstadoBrasileiro.values()) {
			System.out.println(uf.getSigla() + "-" + uf.getNomeMaiusculo());
		}

		// selecionando um estado a partir das opções disponíveis
		EstadoBrasileiro ufSelecionado = EstadoBrasileiro.PIAUI;

		System.out.println("O estado selecionado foi: " + ufSelecionado.getNome());
	}
}
