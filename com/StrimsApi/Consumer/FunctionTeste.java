package StrimsApi.Consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionTeste {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8);

        Function<Integer,Integer> dobrar = numero -> numero * 2;

        List<Integer> numerosDobrados = numeros.stream().map(n -> n * 2).toList();
/*
        List<Double> numerosDobrados = numeros.stream().map(dobrar).collect(Collectors.toList());
*/
        numerosDobrados.forEach(System.out::println);

    }
}
