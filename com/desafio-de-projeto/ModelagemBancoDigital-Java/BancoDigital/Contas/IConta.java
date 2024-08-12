package Contas;

abstract class Conta {
    private int agencia;
    private int contaNumero;
    private double saldo;

    public Conta(int agencia, int contaNumero, double saldo) {
        this.agencia = agencia;
        this.contaNumero = contaNumero;
        this.saldo = saldo;
    }

    public void depositar();

    public void sacar();

    public void tranferir();

    public void pix()
            ;

    public double consultaSaldo(){
        return saldo;
    };

    @java.lang.Override
    public String toString() {
        return String.format("Saldo Atual => R$ %.2f",saldo);
    }
}
