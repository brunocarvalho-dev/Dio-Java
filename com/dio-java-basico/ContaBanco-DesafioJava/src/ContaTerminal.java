import java.util.Scanner;

public class ContaTerminal {
    private int numero;
    private String agencia;
    private String nomeCliente;
    private double saldo;

    public ContaTerminal(int numero, String agencia, String nomeCliente, double saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }

    public void boasVindas() {
        String ola = String.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s ",nomeCliente, agencia);
        String contaDador = String.format("conta " + numero + " ");
        String valor = String.format("e seu saldo %.2f já está disponível para saque!",saldo);
        System.out.println(ola.concat(contaDador.concat(valor)));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, digite seu nome: ");
        String nome = sc.nextLine();

        System.out.println(String.format("Por favor %s, digite sua agência: ",nome));
        String agencia = sc.nextLine();

        System.out.println(String.format("Por favor %s, digite sua conta: ",nome));
        int contaNumero = sc.nextInt();

        System.out.println(String.format("Por favor %s, digite seu saldo: ",nome));
        Double valor = sc.nextDouble();

        ContaTerminal contaTerminal = new ContaTerminal(contaNumero, agencia, nome, valor);

        contaTerminal.boasVindas();
    }
}
