package Contas;

public class ContaCorrente extends Conta {

    private double limiteEspecial;
    private static double LIMITE_ESPECIAL_FINAL = 500;

    public ContaCorrente() {

        this.limiteEspecial = LIMITE_ESPECIAL_FINAL;
    }

    @Override
    public void depositar(double valor) {
        if (this.limiteEspecial < LIMITE_ESPECIAL_FINAL) {
            valor -= (LIMITE_ESPECIAL_FINAL - this.limiteEspecial);
            this.limiteEspecial = LIMITE_ESPECIAL_FINAL;
            this.saldo += valor;

        } else {
            this.saldo += valor;
        }
        consultaSaldo();
    }

    @Override
    public void sacar(double valor) {
        if (saldoDisponivel(valor)) {
            if (valor < this.saldo) {
                this.saldo -= valor;
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

        return String.format("\nSaldo atual: R$ %.2f", saldo + "\nLimite: R$ %.2f", limiteEspecial);
    }

    @Override
    protected  boolean saldoDisponivel(double valor){
        boolean validation = false;
        if (valor < (this.saldo + this.limiteEspecial)) {
            validation = true;

            System.out.println("\nOperação realizada com sucesso!");
        } else {

            System.out.println("\nValor não disponível!");
        }
        return validation;
    }

}
