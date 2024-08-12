import Contas.Conta;
import Contas.ContaCorrente;
import Contas.ContaPoupanca;

public class teste {
    public static void main(String[] args) {
        Conta cc = new ContaCorrente();
        Conta cp = new ContaPoupanca();

        cc.consultaSaldo();
        cp.consultaSaldo();
    }
}
