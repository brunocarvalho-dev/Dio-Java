package edu.List.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

/**
 * <h1>ListaTarefa</h1>
 * <p>
 * Classe desenvolvida para fins didáticos, aprendendo a utilizar as <b>COLLECTIONS</b>;
 * </p>
 * <p>
 * Foi criada uma classe para se trabalhar com a <b>LIST</b>,
 * já que para utilizar é preciso um <b>OBJECT</b>, como Object foi utilizada a classe<b>TAREFA</b>;
 * </p>
 *
 * @author Bruno Carvalho
 * @version 1.0
 * @since
 */
public class ListaTarefa {
    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        List<Tarefa> tarefaParaRemover = new ArrayList<>();
        for(Tarefa t : tarefaList){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                tarefaParaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefaParaRemover);
    }

    public int obterNumeroTotalTarefas(){
        return tarefaList.size();
    }

    public void obterDescricoesTarefas(){
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefa tarefaLista = new ListaTarefa();

        System.out.println("O número total de elementos na listá é : " + tarefaLista.obterNumeroTotalTarefas());

        tarefaLista.adicionarTarefa("Tarefa 1");
        tarefaLista.adicionarTarefa("Tarefa 2");
        tarefaLista.adicionarTarefa("Tarefa 2");

        System.out.println("O número total de elementos na listá é : " + tarefaLista.obterNumeroTotalTarefas());

        tarefaLista.removerTarefa("Tarefa 1");

        System.out.println("O número total de elementos na listá é : " + tarefaLista.obterNumeroTotalTarefas());

        tarefaLista.obterDescricoesTarefas();
    }
}
