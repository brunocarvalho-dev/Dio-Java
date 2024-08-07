package edu.Map.Ordenacao.AgendaEventos;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class AgendaEventos {
    //Atributo
    private Map<LocalDate, Evento> eventoMap;

    public AgendaEventos() {
        this.eventoMap = new HashMap<>();
    }

    public void AdicionarEvento(LocalDate data, String nome, String atracao) {
        Evento evento = new Evento(nome, atracao);
        eventoMap.put(data, evento);
    }

    public void ExibirEventos() {
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventoMap);
        System.out.println(eventosTreeMap);
    }

    public void ObterProximoEvento() {
        /*Set<LocalDate> dateSet = eventoMap.keySet(); // Retorna as keys
        Collection<Evento> valores = eventoMap.values(); // Retorna os valores
        */

        LocalDate dataAtual = LocalDate.now();
        System.out.println(dataAtual);
        Map<LocalDate, Evento> eventoTreeMap = new TreeMap<>(eventoMap);// TreeMap Ordena em ordem crescente
        //Map.Entry< x , y > - cria um laço entre as chaves
        for (Map.Entry<LocalDate, Evento> entry : eventoTreeMap.entrySet()) {
            if (entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
                System.out.println("\nProximo evento: " + entry.getValue() +
                        "\nData: " + entry.getKey());
                break;
            }
        }
    }


    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();

        agendaEventos.AdicionarEvento(LocalDate.of(2024, Month.AUGUST,17),"Laddy Gaga", "Casamento");
        agendaEventos.AdicionarEvento(LocalDate.of(2025, 2,10),"Bruce Wainne", "Aniversário");
        agendaEventos.AdicionarEvento(LocalDate.of(2025, Month.MARCH,17),"Clark Kent", "Despedida de Solteiro");
        agendaEventos.AdicionarEvento(LocalDate.of(2024, Month.DECEMBER,17),"Emmy Lee", "Férias");
        agendaEventos.AdicionarEvento(LocalDate.of(2024, 8,7),"Teste", "Atracao Teste");

        agendaEventos.ExibirEventos();

        agendaEventos.ObterProximoEvento();

    }
}
