import Banco.Banco;
import Contas.Conta;
import Contas.ContaCorrente;
import Contas.ContaPoupanca;
import Pessoas.Pessoa;


public class teste {
    public static void main(String[] args) {
        Conta cc1 = new ContaCorrente(new Pessoa("Bruno", "12523504146"));
        Conta cc2 = new ContaCorrente(new Pessoa("Samuel", "784.279.585-10"));
        Conta cc3 = new ContaCorrente(new Pessoa("Matias", "153.638.928-55"));
        Conta poupanca1 = new ContaPoupanca(new Pessoa("Matias", "153.638.928-55"));
        Conta poupanca2 = new ContaPoupanca(new Pessoa("Samuel", "784.279.585-10"));
        Conta poupanca3 = new ContaPoupanca(new Pessoa("Alessandro", "784.279.585-10"));

        Banco bradesco = new Banco("Bradesco");
        Banco itau = new Banco("Itau");

        bradesco.AdicionarContaCorrente(cc1);
        bradesco.AdicionarContaCorrente(cc2);
        bradesco.AdicionarContaCorrente(poupanca1);
        bradesco.AdicionarContaCorrente(poupanca2);

        itau.AdicionarContaCorrente(cc3);
        itau.AdicionarContaCorrente(poupanca3);

        bradesco.mostrarContas();
        bradesco.pesquisaPorNome("Samuel");
        bradesco.pesquisaPorNumero(3);


        //Conta Corrente
        cc1.extrato();
        cc1.depositar(200);
        cc1.sacar(100);
        cc1.pix(poupanca1, 400);
        cc1.extrato();

        //Conta Poupança
        poupanca2.extrato();
        poupanca2.depositar(100.00);
        poupanca1.sacar(150.00);
        poupanca2.tranferir(cc2, 50.00);

        //Conta Corrente 2
        cc2.extrato();
        cc2.pix(cc3, 50);


    }
}
