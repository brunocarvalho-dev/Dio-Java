package edu.Set.Ordenacao.CadastroProdutos;

import java.util.Comparator;
import java.util.Objects;

public class Produtos implements Comparable<Produtos> {
    private String nome;
    private long codProduto;
    private int quantidade;
    private double preco;

    public String getNome() {
        return nome;
    }

    public long getCodProduto() {
        return codProduto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public Produtos(long codProduto, String nome, int quantidade, double preco) {
        this.nome = nome;
        this.codProduto = codProduto;
        this.quantidade = quantidade;
        preco = Double.parseDouble(String.valueOf(preco).replace(",","."));
        this.preco = preco;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Produtos produtos)) return false;
        return getCodProduto() == produtos.getCodProduto();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCodProduto());
    }

    @Override
    public String toString() {
        return String.format(
                "\nNome= " + nome +
                        " - Cod.Produto= " + codProduto +
                        " - Quantidade= " + quantidade +
                        " - Preco= R$ %.2f", preco);
    }

    //Comparando por Nome do produto
    @Override
    public int compareTo(Produtos p) {
        return nome.compareToIgnoreCase(p.getNome());
    }
}

class ComparatorPorPreco implements Comparator<Produtos> {
    @Override
    public int compare(Produtos preco1, Produtos preco2) {
        return Double.compare(preco1.getPreco(), preco2.getPreco());
    }
}

class ComparatorPorCodigoProduto implements Comparator<Produtos> {
    @Override
    public int compare(Produtos cod1, Produtos cod2) {
        return Long.compare(cod1.getCodProduto(), cod2.getCodProduto());
    }
}