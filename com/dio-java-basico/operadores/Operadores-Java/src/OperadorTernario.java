//Dio_JAVA - Aprendendo Sintaxe JAVA
//Aula - Operadores Java - 5 - Operador Ternario

public class OperadorTernario {
    public static void main(String[] args) {

        int num1 = 5;
        int num2 = 10;

        if (num1 == num2) {
            System.out.println("num1 é igual a num2");
        } else if (num1 > num2) {
            System.out.println("num1 é maior que num2");
        } else if (num1 < num2) {
            System.out.println("num1 é menor que num2");
        }

        String resultado = (num1 != num2) ? "num1 não é igual que num2" : "num1 é igual a num2";
        System.out.println(resultado);

        System.out.println("FIM!");
    }
}
