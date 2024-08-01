package edu.iphone;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import edu.iphone.agenda.AgendaTelefonica;
import edu.iphone.aparelhos.IphoneFuncionalidade;

public class Iphone {
    public static void main(String[] args) {
        IphoneFuncionalidade iphone = new IphoneFuncionalidade();

        // navegador
        iphone.exibirPagina("https://github.com/brunocarvalho-dev/Dio-Java/tree/main/com/desafio-de-projeto/ModelagemDiagrama%C3%A7%C3%A3oComponenteIPhone/src/edu/iphone");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();

        //ipode
        iphone.selecionarMusica("Turma do Pagode");
        iphone.tocar();
        iphone.pausar();

        //agenda
        iphone.salvarContato("Bruno Carvalho", "999999999");
        iphone.salvarContato("Maria Silva", "888888888");
        iphone.salvarContato("Joao", "7777777777");

        //iphone.listarContato();

        iphone.buscarcontato("Bruno Carvalho");
        iphone.editarContato();
        //iphone.apagarContato("Bruno Carvalho");
        
        //telefone
        iphone.ligar("11987654321");
        iphone.atender();
        iphone.iniciarCorreioVoz();
        iphone.buscarContatoLigando("Bruno Carvalho");

    }
}
