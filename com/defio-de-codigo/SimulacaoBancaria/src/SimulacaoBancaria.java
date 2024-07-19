import java.util.Scanner;
/**
 * <h1>SimulacaoBancaria</h1>
 * Programa desenvolvido para simular as operações básicas de um banco, como: 
 * <p>
 * <b>Depositar</b>, <b>Sacar</b>, <b>Consultar saldo</b> e <b>Encerrar</b> ;
 *
 *@author BrunoCarvalho
 *@version 1.0
 *@since Codigo para teste de Codigo Simulação Bancaria doprograma Dio - java
 */
public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        double valor = 0;
        boolean continuar = true;

        while (continuar) {
          /*
            System.out.println("Digitea Opção desejada:\n
            1 - Depositar;\n
            2 - Sacar;\n
            3 - Consultar Saldo;\n
            0 - Encerrar")
          */

          int opcao = scanner.nextInt();

          switch (opcao) {
              case 1:
                  // TODO: Ler o valor a ser depositado e atualizar/imprimir o saldo.
                  //recebe o valor digitado pelo usuário e adiciona o valor depositado pelo usuário na variável saldo
                  
                  valor = scanner.nextDouble();
                  saldo += valor;
      
                  System.out.printf("Saldo atual: %.1f \n", saldo); 
                  break;
              case 2:
                  // TODO: Ler o valor a ser sacado e verificar/imprimir se há saldo suficiente.
                  /*recebe o valor digitado pelo usuário se valor menor que saldo
                   e saldo for diferente de zero
                    subtrai o valor digitado pelo usuário da variável saldo
                  */
                  valor = scanner.nextDouble();
                  if ((valor <= saldo) && (saldo != 0)){
                    saldo -= valor;
                    System.out.printf("Saldo atual: %.1f \n", saldo);
                  }else{
                    System.out.println("Saldo insuficiente.");
                  }

                  break;
              case 3:
                // TODO: Exibir o saldo atual da conta.
                 /*
                 * o valor do saldo é impresso no terminal para o usuário;
                 * @param saldo Valor atual do saldo do usuário;
                 */
                  System.out.printf("Saldo atual: %.1f \n", saldo); 
                  break;
              case 0:
                  System.out.println("Programa encerrado.");
                  continuar = false;  // Atualiza a variável de controle para encerrar o loop
                  break;
              default:
                  System.out.println("Opção inválida. Tente novamente.");
          }
      }
      scanner.close();
  }
}