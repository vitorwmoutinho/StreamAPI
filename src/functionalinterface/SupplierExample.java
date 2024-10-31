package functionalinterface;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SupplierExample {
    public static void main(String[] args) {
        Supplier<String> saudacao = () -> "Olá, seja bem vindo";

        List<String> listasaudacoes = Stream.generate(() -> "Olá, seja bem vindo")
                .limit(3).toList();

        listasaudacoes.forEach(System.out::println);

    }


}
