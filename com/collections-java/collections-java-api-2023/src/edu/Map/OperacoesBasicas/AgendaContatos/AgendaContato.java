package edu.Map.OperacoesBasicas.AgendaContatos;

import java.util.HashMap;
import java.util.Map;

public class AgendaContato {
    //Atributos
    private Map<String, Integer> agendaContatosMap;

    public AgendaContato() {
        this.agendaContatosMap = new HashMap<>();
    }

    public void AdicionarContato(String nome, Integer telefone) {
        agendaContatosMap.put(nome, telefone);
    }

    public void RemoverContato(String nome) {
        if (!agendaContatosMap.isEmpty()) {
            agendaContatosMap.remove(nome);
        }
    }

    public void ExibirContato() {
        System.out.println(agendaContatosMap);
    }

    public Integer ExibirNumeroPorNome(String nome) {
        Integer numeroPorNome = null;
        if (!agendaContatosMap.isEmpty()) {
            numeroPorNome = agendaContatosMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContato agendaContatos = new AgendaContato();

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

        agendaContatos.RemoverContato("Bruno Carvalho");
        agendaContatos.RemoverContato("Bruce Banner");

        agendaContatos.ExibirContato();

        System.out.println("\nO número do Contato é: " + agendaContatos.ExibirNumeroPorNome("Emmy Lee"));

    }
}
