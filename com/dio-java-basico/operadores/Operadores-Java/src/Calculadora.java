/**
 * <h1>Calculadora</h1>
 * Programa desenvolvido de forma didática para exemplificar <b>A sobrecarga</b>
 * que ocorre quando duas ou mais funções em uma classe têm o mesmo nome, mas
 * parâmetros diferentes.
 * <p>
 * 
 * @author Bruno Carvalho
 * @version 1.0
 * @since 15/07/2024
 */
public class Calculadora extends Operadores {
    /**
     * A sobrecarga ocorre quando duas ou mais funções em uma classe têm o mesmo
     * nome, mas parâmetros diferentes.
     * 
     * @param a Recebe um valor inteiro
     * @param b Recebe um valor inteiro
     * @return Retorna a soma dos valor <b>Inteiro</b>
     */
    public int somar(int a, int b) {
        return a + b;
    }

    /**
     * A sobrecarga ocorre quando duas ou mais funções em uma classe têm o mesmo
     * nome, mas parâmetros diferentes.
     * 
     * @param a Recebe um valor double
     * @param b Recebe um valor double
     * @return Retorna a soma dos valor <b>double</b>
     */
    public double somar(double a, double b) {
        return a + b;
    }

    /**
     * <h1>Exemplo de Sobrescrita</h1>
     * <p>
     * Ocorre quando uma subclasse fornece uma implementação específica de um método
     * que já está definido na sua superclasse
     */
    @Override
    protected void subtrair(int num1, int num2) {

        System.out.println("Total:" + (num1 - num2));
    }

}
