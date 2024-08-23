package Contas;

import Pessoas.Pessoa;

public class ContaCorrente extends Conta {

    private double limiteEspecial;
    private static final double LIMITE_ESPECIAL_FINAL = 500;

    public ContaCorrente(Pessoa cliente) {
        super(cliente);
        this.limiteEspecial = LIMITE_ESPECIAL_FINAL;

    }

    @Override
    public void depositar(double valor) {
        if (this.limiteEspecial < LIMITE_ESPECIAL_FINAL) {
            valor -= (LIMITE_ESPECIAL_FINAL - this.limiteEspecial);
            this.limiteEspecial = LIMITE_ESPECIAL_FINAL;
        }
        super.depositar(valor);
    }

    @Override
    public void sacar(double valor) {
        if (saldoDisponivel(valor)) {
            if (valor < this.saldo) {
                this.saldo -= valor;
                System.out.println(String.format("\n\nOperação realizada com sucesso!\nSaque: R$ %.2f", valor));
                consultaSaldo();
            } else {
                valor -= this.saldo;
                this.saldo = 0;
                this.limiteEspecial -= valor;
            }
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
            System.out.println(String.format("\n\nOperação realizada com sucesso!\nPix: R$ %.2f", valor));
            contaDestino.depositar(valor);
        }

    }

    @Override
    public void consultaSaldo() {
        String status = String.format("\nSaldo: R$ %.2f", this.saldo);
        status += String.format("\nLimite: R$ %.2f", this.limiteEspecial);
        status += String.format("\nSaldo Total: R$ %.2f", (this.saldo + this.limiteEspecial));

        System.out.printf(status);
    }

    @Override
    protected  boolean saldoDisponivel(double valor){
        boolean validation = false;
        if (valor < (this.saldo + this.limiteEspecial)) {

            validation = true;

        } else {

            System.out.println("\nValor não disponível!");
        }
        return validation;
    }

    @Override
    public void extrato() {
        System.out.println("\n\n**********Extrato Conta Corrente ***********");
        super.extrato();
    }
}
