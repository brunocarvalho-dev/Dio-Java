import java.util.Scanner;
/**
 * <h1>ControleSimplesDeSaques</h1>
 * Programa desenvolvido para verificar o uso do limite da conta validando o <b>saldo</b> e mostrando o saldo atualizado da conta do usuário
 * <p>
 * Receber o valor inicial do <b>saldo</b>, intera um <b>for</b> para verificar quantos <b>saques</b> o usúario deseja realizar, validando o valor do saldo suficiente, é feita a retirada do valor do <b>saque</b>, do <b>saldo bancário</b>, e imprimi na tela a mensagem <b>"Saque realizado. Limite restante: <|>VALOR DO SALDO</|>"</b>;
 *
 * @author BrunoCarvalho
 * @version 1.0
 * @since Codigo para teste de Codigo para verificar o uso do limite, em uma simulação de saque bancario, imprimindo o saldo atualizado no terminal, programa Dio - java
 */

public class ControleSimplesDeSaques {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double limiteDiario = scanner.nextDouble();

        // Loop for para iterar sobre os saques
        for (int i = 1; ; i++) {

            double valorSaque = scanner.nextDouble();

            if (valorSaque == 0) {
                System.out.println("Transacoes encerradas.");
                break; // Encerra o loop
            } else if (valorSaque > limiteDiario) {
                System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
                break; // Encerra o loop
            } else {
                // Atualiza o limite diário e imprimir a saída no formato dos exemplos.
                limiteDiario -= valorSaque;
                System.out.printf("Saque realizado. Limite restante: %.1f\n",limiteDiario);
                
            }
        }

        // Fechar o scanner para evitar vazamentos de recursos
        scanner.close();
    }
}