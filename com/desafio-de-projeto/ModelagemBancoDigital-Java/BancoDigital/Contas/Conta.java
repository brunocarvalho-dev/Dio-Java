public class Conta {
    private int agencia;
    private int numeroConta;
    private double saldo;

    public Conta(int agencia, int numeroConta, double saldo) {
        this.agencia = agencia;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double saldo) {
        this.saldo += saldo;
    }
    public void sacar(double saldo) {
        this.saldo -= saldo;
    }


}
