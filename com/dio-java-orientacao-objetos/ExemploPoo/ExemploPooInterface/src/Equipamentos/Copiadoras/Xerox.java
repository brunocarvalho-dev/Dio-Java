package Equipamentos.Copiadoras;
/**
 * <h1>Xerox</h1>
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
public class Xerox implements Copiadora{
	@Override
	public void Copiar() {
		System.out.println("Copiando via Xerox");
		
	}
}
