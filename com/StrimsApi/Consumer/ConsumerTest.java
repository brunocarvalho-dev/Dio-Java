package StrimsApi.Consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerTest {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

        //Com consumer
        Consumer<Integer> imprimindoNumerosPares = numero -> {
            if (numero % 2 == 0){
                System.out.println(numero);
            }
        };

        numeros.stream().forEach(System.out::println);

    /*
        //Sem o ConsumerTest
        numeros.forEach(n -> {

            if (n % 2 == 0) {
                System.out.println(n);
            }
        });

    */

    }
}
