import java.util.Scanner;

/**
 * <h1>VerificadorNumeroConta</h1>
 * Programa desenvolvido para verificar o numero da conta de um banco
 * <p>
 * <b Lançar uma IllegalArgumentException</b>, e retornar <b>"Numero de conta
 * invalido. Digite exatamente 8 digitos."</b> ;
 *
 * @author BrunoCarvalho
 * @version 1.0
 * @since Codigo para teste de Codigo para verificar o numero da conta de um
 *        banco do programa Dio - java
 */
public class VerificadorNumeroConta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            String numeroConta = scanner.nextLine();

            // Chamar o método que veritica se o número da conta é valido
            verificarNumeroConta(numeroConta);

            // Caso nenhuma exceção seja lançada, imprime a mensagem de sucesso.
            System.out.println("Numero de conta valido.");
        } catch (IllegalArgumentException e) {
            // Informar que o número de conta é inválido e exibir a mensagem de erro
            System.out.println("Erro: " + e.getMessage());
        } finally {
            // Fechar o scanner para evitar vazamentos de recursos
            scanner.close();
        }
    }

    /**
     * <h2>verificadorNumeroConta</h2>
     * Método faz a validação do número da conta, se a variavél <b>numeroConta</b>
     * contem 8 dígitos;
     * <h3>Erro</h3> dispara uma <b>illegalArgumentExeception</b> com a menssagem:
     * <p>
     * <b>"Numero de conta invalido. Digite exatamente 8 digitos."</b>
     * 
     * @param numeroConta
     */
    private static void verificarNumeroConta(String numeroConta) {
        if (numeroConta.length() != 8) {
            // Lança uma IllegalArgumentException com a seguinte mensagem:
            // "Numero de conta invalido. Digite exatamente 8 digitos."
            throw new IllegalArgumentException("Numero de conta invalido. Digite exatamente 8 digitos");
        }
    }
}
