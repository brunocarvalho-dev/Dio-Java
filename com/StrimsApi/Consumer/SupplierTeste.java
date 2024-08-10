package StrimsApi.Consumer;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.lang.System.*;

public class SupplierTeste {
    public static void main(String[] args) {


        Supplier<String> saudacao = () -> "Olá Bem Vindo(a)!";

        List<String> listaSaudacoes = Stream
                .generate(saudacao)
                .limit(5)
                .toList();

        listaSaudacoes.stream().forEach(out::println);
    }
}
