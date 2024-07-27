//Dio_JAVA - Aprendendo Sintaxe JAVA
//Aula - Operadores Java - 2

public class Operadores {
    public static void main(String[] args) throws Exception {
        // qual o comportamento dessa expreção

        String concatenacao = "?";

        // Ex -1
        concatenacao = 1 + 1 + 1 + "1";
        System.out.println(concatenacao);

        // Ex - 2
        concatenacao = 1 + "1" + 1 + 1;
        System.out.println(concatenacao);

        // Ex - 3
        concatenacao = 1 + "1" + 1 + "1";
        System.out.println(concatenacao);

        // Ex - 4
        concatenacao = "1" + 1 + 1 + 1;
        System.out.println(concatenacao);

        // Ex - 5
        concatenacao = "1" + (1 + 1 + 1);
        System.out.println(concatenacao);

    }

    /**
     * <h1>Exemplo de Sobrescrita</h1>
     * <p>
     * Ocorre quando uma subclasse fornece uma implementação específica de um método
     * que já está definido na sua superclasse
     */
    protected void subtrair(int num1, int num2) {
        int total = num1 - num2;
        System.out.println("O total é : " + total);

    }
}
