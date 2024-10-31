package functionalinterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {


    List<String> palavras = Arrays.asList("java","Kotlin","python"
            ,"javascript", "c", "go", "ruby");

    Predicate<String> maisDeCincoCaracteres = palavra -> palavra.length() > 5;

    palavras.stream().filter(p -> {
            return p.length() < 5;
            }).forEach(System.out::println);

    }
}
