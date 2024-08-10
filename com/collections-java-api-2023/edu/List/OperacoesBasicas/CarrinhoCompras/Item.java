package edu.List.OperacoesBasicas.CarrinhoCompras;

public class Item {

    private String nome;
    private Double valor;
    private Integer qtde;

    public Item(String nome, Double valor, Integer qtde) {
        this.nome = nome;
        this.valor = valor;
        this.qtde = qtde;
    }

    public String getNome() {
        return nome;
    }

    public Double getValor() {
        return valor;
    }

    public Integer getQtde() {
        return qtde;
    }

    @Override
    public String toString() {
        return String.valueOf(String.format(
                "Nome: " + nome +
                        "Valor: R$ %.2f",
                valor +
                        "Quantidade: %.0f",
                qtde));
    }
}
