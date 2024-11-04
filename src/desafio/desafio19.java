package desafio;
/*
Desafio 19 - Encontre a soma dos números divisíveis por 3 e 5:
Com a Stream API, encontre a soma dos números da lista
que são divisíveis tanto por 3 quanto por 5
e exiba o resultado no console.
 */

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

public class desafio19 {
    public static void main(String[] args){
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

       int somaMultiplosDe3Ou5 = numeros.stream()
                .filter(n -> n % 3 == 0 || n % 5 == 0)
               .mapToInt(Integer::intValue).sum();


        System.out.println("soma dos multiplos de 3 ou 5: "+ somaMultiplosDe3Ou5);


    }
}
