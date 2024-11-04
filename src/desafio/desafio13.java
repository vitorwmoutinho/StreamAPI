package desafio;
/*
Desafio 13 - Filtrar os números que estão dentro de um intervalo:
Utilize a Stream API para filtrar os números que
 estão dentro de um intervalo específico (por exemplo, entre 5 e 10)
 e exiba o resultado no console.
 */
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class desafio13 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> numerosFiltrados = numeros.stream()
                .filter(n -> n >= 1 && n <= 4) // Filtra números entre 5 e 10
                .collect(Collectors.toList()); // Coleta os resultados em uma lista

        System.out.println("Números entre 5 e 10: " + numerosFiltrados);
    }
}
