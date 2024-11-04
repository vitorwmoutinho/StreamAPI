package desafio;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.Arrays.*;

/*
Desafio 17 - Filtrar os números primos da lista:
Com a ajuda da Stream API, filtre os números primos
da lista e exiba o resultado no console.
 */
public class desafio17 {
    public static void main(String[] args) {
        List<Integer> numeros = asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> numerosPrimos = numeros.stream()
                .filter(desafio17::isPrime)
                .collect(Collectors.toList());

        System.out.println("Números primos: " + numerosPrimos);

    }
    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        return IntStream.rangeClosed(2, (int) Math.sqrt(number))
                .noneMatch(i -> number % i == 0);
    }
}
