import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = scanner.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = scanner.nextInt();

        try {
            //chamando o método contendo a lógica de contagem
            contar(parametroUm, parametroDois);

        } catch (ParametrosInvalidosException exception) {
            //imprimindo a mensagem: O segundo parâmetro deve ser maior que o primeiro
            System.out.println(exception.Menssagem());

        }

    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        //validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException(parametroUm, parametroDois);
        } else {
            int num1 = parametroUm;
            int num2 = parametroDois;
            int contagem = 0;
            //realizar o for para imprimir os números com base na variável contagem
            for (; num1 <= num2; num1++) {
                System.out.println("Imprimindo o número " + num1);
                contagem++;
            }
            System.out.println("o número de impressões foi " + contagem);
        }
    }
}
