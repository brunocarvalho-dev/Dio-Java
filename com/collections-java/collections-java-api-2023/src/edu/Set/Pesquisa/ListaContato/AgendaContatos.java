package edu.Set.OperacoesBasicas.Pesquisa.ListaContato;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void AdicionarContato(String nome, int numero) {
        try {
            contatoSet.add(new Contato(nome, numero));
        } catch (Exception e) {
            System.out.println("Contato não adicionado\n" + e);
        }
    }

    public void ExibirContato() {
        System.out.println(contatoSet);
    }

    public Set<Contato> PesquisarPorNome(String nome) {
        Set<Contato> contatosPorNome = new HashSet<>();
        for (Contato c : contatoSet) {
            if (c.getNome().startsWith(nome)) {
                contatosPorNome.add(c);
            }
        }
        if (contatosPorNome.isEmpty()) {
            System.out.println("Contato " + nome + " não encontrado");
        }
        return contatosPorNome;
    }

    public Contato AtualizarNumeroContato(String nome, int numero) {
        Contato contatoAtualizado = null;
        for (Contato c : contatoSet) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                c.setNumero(numero);
                contatoAtualizado = c;
                System.out.println("\nContato Atualizado: " + contatoAtualizado);
                break;
            }
        }
        if (contatoAtualizado == null) {
            System.out.println("Contato não encontrado");
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.ExibirContato();

        agendaContatos.AdicionarContato("Bruno Carvalho", 999999999);
        agendaContatos.AdicionarContato("Bruce Winne", 888888888);
        agendaContatos.AdicionarContato("Bruce Banner", 777777777);
        agendaContatos.AdicionarContato("Emmy Lee", 666666666);
        agendaContatos.AdicionarContato("Clark Kent", 555555555);
        agendaContatos.AdicionarContato("Darth Vader", 444444444);
        agendaContatos.AdicionarContato("Bruce Wainne", 333333333);
        agendaContatos.AdicionarContato("Clark Kent", 222222222);
        agendaContatos.AdicionarContato("Bruno Carvalho", 111111111);
        agendaContatos.AdicionarContato("Maria Silva", 111111111);

        agendaContatos.ExibirContato();

        agendaContatos.AtualizarNumeroContato("Bruno Carvalho", 987654321);

        System.out.println(agendaContatos.PesquisarPorNome("Bruce"));

        System.out.println(agendaContatos.PesquisarPorNome("Marta Wainne"));


    }
}
