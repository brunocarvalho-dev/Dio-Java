package edu.List.OperacoesBasicas.CarrinhoCompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompras {
    private List<Item> listaItem;

    public CarrinhoCompras() {
        this.listaItem = new ArrayList<>();
    }

    // Adicionando item carrinho
    public void adicionarItem(String nome, double valor, int qtd) {
        listaItem.add(new Item(nome, valor, qtd));
    }

    // Removendo item carrinho
    public void removerItem(String nome) {
        List<Item> itemRemoverCarrinho = new ArrayList<>();
        for (Item i : listaItem) {
            if (i.getNome().equalsIgnoreCase(nome)) {
                itemRemoverCarrinho.add(i);
            }
        }
        listaItem.removeAll(itemRemoverCarrinho);
    }

    // Calculando valor total
    public void calcularValorTotal() {
        int i = 0, qtd = 0;
        double total = 0, valor = 0;
        if (!listaItem.isEmpty()) {
            for (Item t : listaItem) {
                valor = t.getValor();
                qtd = t.getQtde();
                total += (qtd * valor);
            }
            System.out.println(String.format("Valor total do carrinho: R$ %.2f", total));
        } else {
            throw new RuntimeException("O carrinho está vazio!");
        }
    }

    // Mostrar item no carrinho
    public void mostrarItem() {
        if (!listaItem.isEmpty()) {
            for (Item item : listaItem) {
                System.out
                        .println(String.format("Nome: " + item.getNome() + "\n Valor: R$ %.2f - QTD: " + item.getQtde(),
                                item.getValor()));
                System.out.println("-------------------------------------");

            }
        } else {
            System.out.println("O carrinho vazio!");
        }
    }

    public static void main(String[] args) {
        CarrinhoCompras compras = new CarrinhoCompras();

        compras.adicionarItem("carrinhos", 5.00, 3);
        compras.adicionarItem("latas leite", 45.00, 2);
        compras.adicionarItem("pão", 1.05, 20);
        compras.adicionarItem("frios", 4.99, 5);

        compras.mostrarItem();
        compras.calcularValorTotal();

    }
}
