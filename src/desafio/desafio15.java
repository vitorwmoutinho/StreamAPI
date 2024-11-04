package desafio;
/*
Desafio 15 - Verifique se a lista contém pelo menos um número negativo:
Utilizando a Stream API, verifique se a lista contém pelo menos um número negativo
e exiba o resultado no console.
 */
import java.util.Arrays;
import java.util.List;

public class desafio15 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3, -1);

        boolean numeroNegativo = numeros.stream().anyMatch(n -> n < 0);


        System.out.println("Numero negativo: "+ numeroNegativo);


    }
}
