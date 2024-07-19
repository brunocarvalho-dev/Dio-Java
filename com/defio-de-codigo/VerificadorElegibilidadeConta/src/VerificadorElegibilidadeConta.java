import java.util.Scanner;

/**
 * <h1>VerificadorElegibilidadeConta</h1>
 * Programa desenvolvido para verificar se a idade do cliente é <b>>= (Maior ou
 * igual) 18 naos</b>;
 * <p>
 * <
 * <h3>Sucesso</h3> Exibi a mensagem: <b>"Voce esta elegivel para criar uma
 * conta bancaria."</b> ;
 * <h3>Erro</h3> Exibi a mensagem: <b>"Voce nao esta elegivel para criar uma
 * conta bancaria."</b>;
 * 
 * @author BrunoCarvalho
 * @version 1.0
 * @since Codigo para teste de Codigo para verificar elegibilidade para abertura
 *        d conta em um banco do programa Dio - java
 */

public class VerificadorElegibilidadeConta {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String idade = scanner.nextLine();
        

        // Verifica se a idade do cliente
        try{
            verificarDadosDigitados(idade);

        }catch(IllegalArgumentException e){
            System.out.println("Erro: " + e.getMessage());

        }
        // Se >= 18, imprimir "Voce esta elegivel para criar uma conta bancaria."
        // Caso contrário, imprimir "Voce nao esta elegivel para criar uma conta
        // bancaria."

        // Fechar o scanner para evitar vazamentos de recursos
        scanner.close();
        }
/**
 * <h3>verificadorMaiorIdade</h3> verificar se idade de um cliente é elegível para criar uma conta bancária;
 * 
 * @param idade Recebe o valor verificado
 */
    private  static void VerificarMaioridadeLegal(int idade) {
    
        if (idade >= 18) {
                System.out.println("Voce esta elegivel para criar uma conta bancaria.");
    
        }else {
            System.out.println("Voce nao esta elegivel para criar uma conta bancaria.");
        }

    }
/**
 * <h3>verificadorDadosDigtados</h3> Verifica se os dados digitados são validos,
 * antes da verificação da <b>Elegibilidade do usuário</b>
 * 
 * @param idade Recebe uma Strig, e converte para um int
 */
    private  static void verificarDadosDigitados(String idade){
        
        int validacaoNumerica = Integer.parseInt(idade);
        if((validacaoNumerica <= 0)||(validacaoNumerica > 150)){
            throw new IllegalArgumentException ("Valor digitado inválido");
            
        }else{
            VerificarMaioridadeLegal(validacaoNumerica);
        }
    }

}
