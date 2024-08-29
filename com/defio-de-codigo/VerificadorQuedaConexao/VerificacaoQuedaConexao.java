import java.util.Scanner;

/**
 * <h1>Verificando Velocidade Média e Queda de Conexão</h1>
 * <p>
 * Implemente um programa que verifique se houve queda de conexão em um dia. <br>
 * A queda de conexão é definida como qualquer velocidade registrada igual a 0 Mbps. <br>
 * O sistema deve ler os registros de velocidade de conexão, processar os dados <br>
 * e determinar se ocorreu queda de conexão durante o dia.
 * </p>
 * <p>
 *
 * @author Bruno Carvalho
 * @version 1.0
 * @parameter A entrada é uma string contendo uma lista de valores representando a velocidade de conexão em megabits por segundo (Mbps), separados por vírgulas.
 * @parameter Deverá retornar "Queda de Conexao" se houver pelo menos uma velocidade registrada igual a 0 Mbps, e "Sem Quedas" caso contrário.
 * </p>
 * @since 27/08/2024
 */
public class VerificacaoQuedaConexao {

    // Preenchida a função para verificar queda de conexão
    public static String verificarQuedaConexao(String[] velocidades) {
        boolean validation = false;
        for (String s : velocidades) {
            if (s.equalsIgnoreCase("0")) {
                validation = true;
                break;
            }
        }
        return (!validation) ? "Sem Quedas" : "Queda de Conexao";

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitando ao usuário a lista de velocidades de conexão registradas a cada hora
        String input = scanner.nextLine();

        // Convertendo a entrada em uma lista de strings
        String[] velocidades = input.split(",");

        // Verificando se houve queda de conexão
        String resultado = verificarQuedaConexao(velocidades);

        // Exibindo o resultado da verificação
        System.out.println(resultado);

        scanner.close();
    }
}
