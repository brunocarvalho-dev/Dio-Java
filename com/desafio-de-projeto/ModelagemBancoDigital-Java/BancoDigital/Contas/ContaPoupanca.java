package Contas;

import Pessoas.Pessoa;

public class ContaPoupanca extends Conta{

    public ContaPoupanca(Pessoa cliente) {
        super(cliente);
    }

    @Override
    public void depositar(double valor) {
        super.depositar(valor);
    }

    @Override
    public void sacar(double valor) {
        super.sacar(valor);
    }

    @Override
    public void tranferir(Conta contaDestino, double valor) {
        super.tranferir(contaDestino, valor);
    }

    @Override
    public void pix(Conta contaDestino, double valor) {
        super.pix(contaDestino, valor);
    }

    @Override
    public void consultaSaldo() {
        super.consultaSaldo();
    }

    @Override
    public boolean saldoDisponivel(double valor) {
        return super.saldoDisponivel(valor);
    }

    @Override
    public void extrato() {
        System.out.println("\n\n**********Extrato Conta Poupança ***********");
        super.extrato();
    }
}
