package Contas;

public abstract class Conta implements IConta {
    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;
    protected int agencia;
    protected int contaNumero;
    protected double saldo = 0;

    public Conta() {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.contaNumero = SEQUENCIAL++;
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
        consultaSaldo();
    }

    @Override
    public void sacar(double valor) {
        if (saldoDisponivel(valor)) {

            this.saldo -= valor;
            consultaSaldo();

        }
    }

    @Override
    public void tranferir(Conta contaDestino, double valor) {
        if (saldoDisponivel(valor)) {
            this.sacar(valor);
            contaDestino.depositar(valor);
            consultaSaldo();
        }

    }

    @Override
    public void pix(Conta contaDestino, double valor) {
        if (saldoDisponivel(valor)) {
            this.sacar(valor);
            contaDestino.depositar(valor);
            consultaSaldo();
        }


    }

    @Override
    public String consultaSaldo() {

        return String.format("\nSaldo atual: R$ %.2f", saldo);
    }


    protected boolean saldoDisponivel(double valor) {
        boolean validation = false;
        if (valor < (this.saldo)) {
            validation = true;

            System.out.println("\nOperação realizada com sucesso!");
        } else {
            System.out.println("\nValor não disponível!");
        }
        return validation;
    }
}
