package edu.iphone.agenda;
/**
 * <h1>AgendaTelefonica</h1>
 * Programa desenvolvido, para simular a utilização das <b>INTERFACE</b>
 * utilizando diversas
 * interfaces para <b>IMPLEMENTAR</b> diferentes metódos;
 * <p>
 * Com a utilização desse método torna-se obrigatório a utilização das
 * <b><i>@Override</i><b>, para implementação dos metódos;
 * <p>
 * 
 * @author BrunoCarvalho
 * @version 1.0
 * @since Codigo para avaliação do <b>Desafio de Projeto</>, utilização de
 *        <b>Interfaces</b>,
 *        <b>Abstração</b> e <b>Polimorfismo</b>
 *        programa Dio - java
 */
public interface AgendaTelefonica {

    public void salvarContato(String nome, String telefone);

    public void buscarcontato(String nome);

    public void editarContato();

    public void apagarContato();
}
