package StrimsApi.Consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateTeste {
    public static void main(String[] args) {
        List<String> palavras = Arrays.asList("java", "javaScript", "C", "kotlin", "go", "ruby", "python");

        Predicate<String> maisCincoLetras = palavra -> palavra.length() < 5;

        palavras.stream().filter(maisCincoLetras).forEach(System.out::println);
    }
}
