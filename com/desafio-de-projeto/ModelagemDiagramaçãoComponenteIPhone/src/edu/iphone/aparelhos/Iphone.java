package edu.iphone.aparelhos;

import edu.iphone.agenda.AgendaTelefonica;
import edu.iphone.navegadorInternet.Navegador;
import edu.iphone.reprodutorMusical.Ipode;
import edu.iphone.telefone.AparelhoTelefonico;

/**
 * <h1>Iphone</h1>
 * Programa desenvolvido, para simular a utilização das <b>INTERFACE</b>
 * utilizando diversas
 * interfaces para <b>IMPLEMENTAR</b> diferentes metódos;
 * <p>
 * Utilizando <b>IMPLEMENTS</b> é possivél implementar métodos das classes
 * <b>NAVEGADOR</b>, <b>IPODE</b>, <b>APARELHOTELEFONICO</b> e
 * <b>AGENDATELEFONICA</b>,
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
public class Iphone implements Navegador, Ipode, AparelhoTelefonico, AgendaTelefonica {
    // navegador

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova Aba no navegador do Iphone");

    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando pagina no navegador do Iphone");

    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Acessando site atravez da URL no navegador do Iphone");

    }

    // Ipode

    @Override
    public void pausar() {
        System.out.println("Pausando música no Iphone");

    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando música no Iphone");

    }

    @Override
    public void tocar() {
        System.out.println("Tocando música no Iphone");

    }

    // Função Telefone
    @Override
    public void atender() {
        System.out.println("Atendendo ligação na função telefone do Iphone");

    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando Correio de voz na função telefone do Iphone");
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Fazendo uma ligação na função telefone do Iphone para o número: " + numero);

    }

    @Override
    public void buscarContatoLigando(String nome) {
        String Telefone = "Buscando Telefone do Contato: " + nome;
        Telefone = "11987654320";
        ligar(Telefone);

    }

    // Função agenda
    @Override
    public void apagarContato() {
        System.out.println("Apagando contato na função agenda do Iphone");

    }

    @Override
    public void editarContato() {
        System.out.println("Editando contato na função agenda do Iphone");

    }

    @Override
    public void salvarContato(String nome, String telefone) {
        System.out.println("Salvando contato na função agenda do Iphone");
    }

    @Override
    public void buscarcontato(String nome) {
        String Telefone = "Buscando Telefone do Contato: " + nome;
        System.out.println(Telefone);

    }

}
