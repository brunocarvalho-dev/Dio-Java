/**
 * <h1>EstadoBrasileiro</h1>
 * Programa desenvolvido como <b>ENUM</b> Desenvolvido para funcionar como
 * referencia para os estados, uma classe que serve para ser instanciada por
 * todo o código, com código repetitivo;
 * <p>
 * @author BrunoCarvalho
 * @version 1.0
 * @since Codigo para aprendizado da utilização da propriedade <b>ENUM</b>, programa Dio - java
 */

public enum EstadoBrasileiro {
	SAO_PAULO("SP", "São Paulo"),
	RIO_JANEIRO("RJ", "Rio de Janeiro"),
	PIAUI("PI", "Piauí"),
	MARANHAO("MA", "Maranhão");

	private String nome;
	private String sigla;

	private EstadoBrasileiro(String sigla, String nome) {
		this.sigla = sigla;
		this.nome = nome;
	}

	public String getSigla() {
		return sigla;
	}

	public String getNome() {
		return nome;
	}

	public String getNomeMaiusculo() {
		return nome.toUpperCase();
	}

}