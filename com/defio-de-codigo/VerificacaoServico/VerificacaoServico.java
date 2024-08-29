import java.util.Scanner;

/**<h1>Verificacao de Servico</h1>
 * <p>
 *      Implementação de um programa que verifique se um cliente específico contratou um determinado serviço.
 * </p>
 * @author Bruno Carvalho
 * @version 1.0
 * @since 27/08/2024
 */
public class VerificacaoServico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada do serviço a ser verificado
        String servico = scanner.nextLine().trim();

        // Entrada do nome do cliente e os serviços contratados
        String entradaCliente = scanner.nextLine().trim();

        // Separando o nome do cliente e os serviços contratados
        String[] partes = entradaCliente.split(",");
        String nomeCliente = partes[0];
        boolean contratado = VerificacaoDeServicoContratado(servico,partes);

        // Verifique se o serviço está na lista de serviços contratados
        String response = (contratado)?"Sim":"Nao";
        System.out.println(response);


        scanner.close();
    }
    public static boolean VerificacaoDeServicoContratado(String servicoParaConsulta, String [] contratosDeServico){
        boolean response = false;
        for(String s: contratosDeServico){
            if (s.equalsIgnoreCase(servicoParaConsulta)){
                response = true;
                break;
            }
        }
        return response;
    }
}