package Contas;

import Pessoas.Pessoa;

import java.util.List;


public abstract class Conta implements IConta {

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;
    protected int agencia;
    protected int contaNumero;
    protected double saldo;
    protected Pessoa cliente;

    public int getClienteNumeroConta() {
        return contaNumero;
    }

    public String getClienteNome() {
        return cliente.getNome().toUpperCase();
    }

    public Conta(Pessoa cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.contaNumero = SEQUENCIAL++;
        this.saldo = 0;
        this.cliente = cliente;
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
        System.out.println(String.format("\n\nOperação realizada com sucesso!\nDepósito: R$ %.2f", valor));
        consultaSaldo();
    }

    @Override
    public void sacar(double valor) {
        if (saldoDisponivel(valor)) {

            this.saldo -= valor;
            System.out.println(String.format("\n\nOperação realizada com sucesso!\nSaque: R$ %.2f", valor));
            consultaSaldo();

        }
    }

    @Override
    public void tranferir(Conta contaDestino, double valor) {
        if (saldoDisponivel(valor)) {
            this.sacar(valor);
            contaDestino.depositar(valor);
            System.out.println(String.format("\n\nOperação realizada com sucesso!\nTraferencia: R$ %.2f", valor));
            consultaSaldo();
        }

    }

    @Override
    public void pix(Conta contaDestino, double valor) {
        if (saldoDisponivel(valor)) {
            this.sacar(valor);
            contaDestino.depositar(valor);
            System.out.println(String.format("\n\nOperação realizada com sucesso!\nPix: R$ %.2f", valor));
            consultaSaldo();
        }


    }

    @Override
    public void consultaSaldo() {

        System.out.println(String.format("\nSaldo atual: R$ %.2f", this.saldo));
    }


    protected boolean saldoDisponivel(double valor) {
        boolean validation = false;
        if (valor < (this.saldo)) {
            validation = true;

        } else {
            System.out.println("\nValor não disponível!");
        }
        return validation;
    }

    @Override
    public void extrato() {
        System.out.println("\nTitular: " + this.cliente.getNome() + "\nCpf: " + this.cliente.getCpf() + "\nAgencia: " + this.agencia + "\nConta: " + this.contaNumero);
        consultaSaldo();

    }
}
