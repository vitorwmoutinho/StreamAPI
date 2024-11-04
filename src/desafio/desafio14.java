package desafio;
/*
Desafio 14 - Encontre o maior número primo da lista:
Com a Stream API, encontre o maior número primo da lista
e exiba o resultado no console.
 */

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class desafio14 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        OptionalInt maiorPrimo = numeros.stream()
                .filter(desafio14::isPrime)
                .mapToInt(Integer::intValue)
                .max();
        System.out.println("Maior número primo: " + (maiorPrimo.isPresent() ? maiorPrimo.getAsInt() :
                "Nenhum primo encontrado"));

    }


    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        return IntStream.rangeClosed(2, (int) Math.sqrt(number))
                .noneMatch(i -> number % i == 0);
    }
}

