import java.util.Scanner;
/**<h1>Verificando Velocidade Média e Queda de Conexão</h1>
 * <p>
 *      sistema que calcule a velocidade média de conexão de internet de um cliente durante um período.<br>
 *      O sistema deve ler os registros recebidos como entrada, processar os dados<br>
 *      e calcular a velocidade média de conexão em megabits por segundo (Mbps) ao longo do turno.
 * </p>
 * <p>
 * @parameter A entrada é uma string contendo uma lista de valores representando a velocidade de conexão em megabits por segundo (Mbps), separados por vírgulas.
 * @parameter A saída do programa deve ser a velocidade média de conexão em Mbps.
 * </p>
 * @author Bruno Carvalho
 * @version 1.0
 * @since 27/08/2024
 */
public class VelocidadeMedia {

    // Função para calcular a velocidade média de conexão de internet
    public static double calcularVelocidadeMedia(String[] velocidades) {
        int total = 0;

        //Soma todas as velocidades registradas e calcule a média
        for(String s: velocidades){
            total += Integer.parseInt(s);
        }
        return total/velocidades.length;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitando ao usuário a lista de velocidades de conexão registradas a cada hora
        String input = scanner.nextLine();

        // Convertendo a entrada em uma lista de strings
        String[] velocidades = input.split(",");

        // Calculando a velocidade média de conexão
        double velocidadeMedia = calcularVelocidadeMedia(velocidades);

        // Exibindo a velocidade média de conexão
        System.out.println((int)velocidadeMedia + " Mbps");

        scanner.close();
    }
}