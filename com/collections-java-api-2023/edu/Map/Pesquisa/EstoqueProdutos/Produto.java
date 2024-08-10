package edu.Map.Pesquisa.EstoqueProdutos;

public class Produto {
    //Atributo
    private String nome;
    private int quantidade;
    private double preco;

    public Produto(String nome, int quantidade, double preco) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = Double.parseDouble(String.valueOf(preco).replace("," ,"."));
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return String.format("Nome= " + nome +
                " Quantidade= " + quantidade +
                " Preco= R$ %.2f\n", preco );
    }
}
