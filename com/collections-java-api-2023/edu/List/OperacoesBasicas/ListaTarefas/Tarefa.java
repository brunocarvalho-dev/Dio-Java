package edu.List.OperacoesBasicas.ListaTarefas;

/**
 * <h1>Tarefa</h1>
 * 
 * @author Bruno Carvalho
 * @version 1.0
 * @since Programa desenvolvido de forma didática para
 *        desenvolver a utilização das <b>COLLECTIONS</b>, foi desenvolvido a
 *        Collection <b>LIST</b>;
 */
public class Tarefa {
    private String descricao;

    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return descricao;
    }
}
