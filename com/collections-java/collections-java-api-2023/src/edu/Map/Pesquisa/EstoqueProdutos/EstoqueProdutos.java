package edu.Map.Pesquisa.EstoqueProdutos;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    //Atributos
    private Map<Long, Produto> estoqueProdutosMap;

    public EstoqueProdutos() {
        this.estoqueProdutosMap = new HashMap<>();
    }

    public void AdicionarProduto(Long codProdutos, String nome, int quantidade, double preco) {
        estoqueProdutosMap.put(codProdutos, new Produto(nome, quantidade, preco));
    }


    public void ExibirProduto() {
        if (!estoqueProdutosMap.isEmpty()) {
            System.out.println(estoqueProdutosMap);
        } else {
            System.out.println("Estoque vazio!");
        }
    }

    public double CalcularValorTotalEstoque() {
        double valorTotalEstoque = 0;
        if (!estoqueProdutosMap.isEmpty()) {
            for (Produto produto : estoqueProdutosMap.values()) {
                valorTotalEstoque += (produto.getQuantidade() * produto.getPreco());
            }
        }
        return valorTotalEstoque;
    }

    public Produto ObterProdutoMaisCaro() {
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        for (Produto produto : estoqueProdutosMap.values()) {
            if (produto.getPreco() > maiorPreco) {
                produtoMaisCaro = produto;
                maiorPreco = produto.getPreco();
            }
        }
        return produtoMaisCaro;
    }

    public Produto ObterProdutoMaisBarato() {
        Produto produtoMaisBarato = null;
        double menorPreco = Double.MAX_VALUE;
        for (Produto produto : estoqueProdutosMap.values()) {
            if (produto.getPreco() < menorPreco) {
                produtoMaisBarato = produto;
                menorPreco = produto.getPreco();
            }
        }
        return produtoMaisBarato;
    }

    public Produto ObterProdutoMaiorValorPorQuantidadeEmEstoque(){
        Produto produtoMaiorValorEmEstoque = null;
        double maiorValor = Double.MIN_VALUE;
        for (Produto produto: estoqueProdutosMap.values()){
            double valorDoEstoque = (produto.getPreco()* produto.getQuantidade());
            if (valorDoEstoque >maiorValor){
                produtoMaiorValorEmEstoque = produto;
                maiorValor = valorDoEstoque;
            }
        }
        return produtoMaiorValorEmEstoque;

    }
//verificar codigo remover produto
    public void RemoverProdutoPorCodigo(long codigoProduto) {
        try {
            estoqueProdutosMap.remove(codigoProduto);
            System.out.println("Produto: " + estoqueProdutosMap.get(codigoProduto).getNome() + "\ncodigo: " + codigoProduto +" Removido com sucesso!");
        }catch (Exception e){
            System.out.println("Código do Produto inválido\n" + e);
        }
    }

    public static void main(String[] args) {
        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();

        estoqueProdutos.ExibirProduto();

        estoqueProdutos.AdicionarProduto(1234L,"Produto 1", 30, 6.99);
        estoqueProdutos.AdicionarProduto(2345L,"Produto 2", 40, 16.99);
     /*   estoqueProdutos.AdicionarProduto(3456L,"Produto 3", 20, 24.99);
        estoqueProdutos.AdicionarProduto(4567L,"Produto 4", 15, 9.99);
        estoqueProdutos.AdicionarProduto(5678L,"Produto 5", 10, 11.99);
        estoqueProdutos.AdicionarProduto(6789L,"Produto 6", 25, 13.99);
        estoqueProdutos.AdicionarProduto(7890L,"Produto 7", 60, 4.99);
     */   estoqueProdutos.AdicionarProduto(8901L,"Produto 8", 75, 6.99);

        estoqueProdutos.ExibirProduto();

        estoqueProdutos.RemoverProdutoPorCodigo(1234);

        estoqueProdutos.ExibirProduto();

        System.out.println(estoqueProdutos.ObterProdutoMaisCaro());

        System.out.println(estoqueProdutos.ObterProdutoMaisBarato());

        System.out.println(estoqueProdutos.ObterProdutoMaiorValorPorQuantidadeEmEstoque());

        System.out.println(estoqueProdutos.CalcularValorTotalEstoque());

    }
}
