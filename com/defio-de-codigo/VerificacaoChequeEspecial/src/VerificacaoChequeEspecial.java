import java.util.Scanner;
/**
 * <h1>VerificacaoChequeEspecial</h1>
 * Programa desenvolvido para verificar o uso do limite do cheque especial em um saque bancario
 * <p>
 * Receber o valor inicial do <b>saldo</b>, e do valor do <b>Saque</b>, verificar se o valor solicitado é compativel com os valores do saldo da conta e do <b>limite do cheque especial</b> ;
 *
 * @author BrunoCarvalho
 * @version 1.0
 * @since Codigo para teste de Codigo para verificar o uso do limite do cheque especial em uma simulação de saque bancario,  do programa Dio - java
 */
public class VerificacaoChequeEspecial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double saldo = scanner.nextDouble();
        double saque = scanner.nextDouble();

        // Define um limite para o cheque especial
        double limiteChequeEspecial = 500;

        // Verifica se o saque ultrapassa o saldo + limite do cheque especial disponível
        // Em caso positivo, imprimi "Transacao nao realizada. Limite do cheque especial excedido."
        if(saque <= (saldo + limiteChequeEspecial)){
            
            // Verificar se o saque ultrapassa o saldo
            // Em casoa Positivo Imprimi, "Transação realizada com sucesso."
            // Em caso Negativo, imprimi "Transacao realizada com sucesso utilizando o cheque especial."
            if (saque <= saldo) {
              // Imprimi "Transação realizada com sucesso."
              System.out.println("Transação realizada com sucesso.");
            }else{
              
              System.out.println("Transação realizada com sucesso utilizando o cheque especial.");
            }
        } else {
            
            // Imprimir "Transacao nao realizada. Limite do cheque especial excedido."
            System.out.println( "Transação não realizada. Limite do cheque especial excedido.");
        }

        // Fechar o scanner para evitar vazamentos de recursos
        scanner.close();
    }
}