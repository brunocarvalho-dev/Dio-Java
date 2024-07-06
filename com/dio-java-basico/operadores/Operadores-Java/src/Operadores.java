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
}
