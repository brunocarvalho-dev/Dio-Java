import java.util.Scanner;
/**<h1>Verificacao de Combo Completo</h1>
 * <p>
 *      Implemente um sistema que verifique se um cliente de uma empresa de telecomunicações contratou um combo completo de serviços.
 * </p>
 * @author Bruno Carvalho
 * @version 1.0
 * @since 27/08/2024
 */
public class VerificadorCombo {

    // Função para verificar se o cliente contratou um combo completo
    public static String verificarComboCompleto(String[] servicosContratados) {
        // Variáveis booleanas para verificar a contratação de cada serviço
        boolean movelContratado = false;
        boolean bandaLargaContratada = false;
        boolean tvContratada = false;

        // Itere sobre os serviços contratados
        for (String servico : servicosContratados) {
            if(servico.equalsIgnoreCase("movel")){
                movelContratado = true;
            }else if(servico.equalsIgnoreCase("banda larga")){
                bandaLargaContratada = true;
            }else if(servico.equalsIgnoreCase("tv")){
                tvContratada = true;
            }
        }

        // TODO: Verifique se todos os serviços foram contratados
        if (movelContratado && bandaLargaContratada && tvContratada) {
            return "Combo Completo";
        } else {
            return "Combo Incompleto";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitando ao usuário a lista de serviços contratados
        String input = scanner.nextLine();

        // Convertendo a entrada em uma lista de strings
        String[] servicosContratados = input.split(",");

        // Verificando se o cliente contratou um combo completo
        String resultado = verificarComboCompleto(servicosContratados);

        // Exibindo o resultado
        System.out.println(resultado);

        // Fechando o scanner
        scanner.close();
    }
}