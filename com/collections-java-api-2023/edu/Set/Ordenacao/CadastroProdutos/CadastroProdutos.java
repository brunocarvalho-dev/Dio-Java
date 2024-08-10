package edu.Set.Ordenacao.CadastroProdutos;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    private Set<Produtos> produtosSet;

    public CadastroProdutos() {
        this.produtosSet = new HashSet<>();
    }

    public void AdicionarProdutos(long codProduto, String nome, int quantidade, double preco) {
        produtosSet.add(new Produtos(codProduto, nome, quantidade, preco));
    }

    public Set<Produtos> ExibirProdutoPorNome() {
        Set<Produtos> produtosProNOme = new TreeSet<>(produtosSet);
        return produtosProNOme;
    }

    public Set<Produtos> ExibirPorPreco() {
        Set<Produtos> produtoPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtoPorPreco.addAll(produtosSet);
        return produtoPorPreco;
    }

    public Set<Produtos> ExibirPorCodigoProdutos() {
        Set<Produtos> produtoPorCodigo = new TreeSet<>(new ComparatorPorCodigoProduto());
        produtoPorCodigo.addAll(produtosSet);
        return produtoPorCodigo;
    }

    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        System.out.println(cadastroProdutos.produtosSet);

        cadastroProdutos.AdicionarProdutos(1L,"Produto 1", 5, 5.85);
        cadastroProdutos.AdicionarProdutos(2L,"Produto 2", 7, 7.90);
        cadastroProdutos.AdicionarProdutos(3L,"Produto 3", 9, 8.74);
        cadastroProdutos.AdicionarProdutos(2L,"Produto 4", 2, 5.00);
        cadastroProdutos.AdicionarProdutos(4L,"Produto 5", 5, (87.92/25));

        System.out.println(cadastroProdutos.ExibirProdutoPorNome());

        System.out.println(cadastroProdutos.ExibirPorCodigoProdutos());



    }
}
