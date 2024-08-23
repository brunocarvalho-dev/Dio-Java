package Contas;

public interface IConta {

    void depositar(double valor);

    void sacar(double valor);

    void tranferir(Conta contaDestino, double valor);

    void pix(Conta contaDestino, double valor);

    void consultaSaldo();

    void extrato();
}
