package Banco;

import Contas.Conta;
import Contas.ContaCorrente;
import Contas.ContaPoupanca;
import Pessoas.Pessoa;

import java.time.temporal.ValueRange;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Banco {
    private String nome;
    private int CODIGO_BANCARIO = 1;
    private List<Conta> contas;

    public Banco(String nome) {
        this.nome = nome;
        this.CODIGO_BANCARIO = CODIGO_BANCARIO++;
        this.contas = new ArrayList<>();
    }

    public void AdicionarContaCorrente(Conta conta) {
        contas.add(conta);
    }

    public void pesquisaPorNome(String nome) {
        List<Conta> contasPorNome = new ArrayList<>();
        if (!contas.isEmpty()) {
            for (Conta conta : contas) {
                if (conta.getClienteNome().equalsIgnoreCase(nome)) {
                    contasPorNome.add(conta);

                }
            }for (Conta c: contasPorNome) {
                c.extrato();
            }
        } else {
            System.out.println("Arrey vazio");
        }
    }

    public void pesquisaPorNumero(int numeroConta) {
        List<Conta> contasPorNumero = new ArrayList<>();
        if (!contas.isEmpty()) {
            for (Conta conta : contas) {
                if (conta.getClienteNumeroConta() == numeroConta) {
                    contasPorNumero.add(conta);
                }
            }
        }
        for (Conta c: contasPorNumero) {
            c.extrato();
        }
    }

    // Mostrar item no carrinho
    public void mostrarContas() {
        if (!contas.isEmpty()) {
            System.out.println("\n\nRELATÓRIO BANCÁRIO");
            for (Conta conta : contas) {

                System.out.println(String.format("\nBanco: " + this.nome + "\nCódigo do Banco: " + this.CODIGO_BANCARIO + "\n\nNome Cliente: " + conta.getClienteNome() + "\nNumero conta: " + conta.getClienteNumeroConta()));
                System.out.println("-------------------------------------");

            }
        } else {
            System.out.println("Relatório de Contas vazio!");
        }
    }

}
