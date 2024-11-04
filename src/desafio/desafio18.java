package desafio;
/*
Desafio 18 - Verifique se todos os números da lista são iguais:
Utilizando a Stream API, verifique se todos os números da lista
são iguais e exiba o resultado no console.
 */

import java.util.Arrays;
import java.util.List;

public class desafio18 {
    public static void main(String[] args){
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        boolean todosDistintos = numeros.stream()
                .allMatch(n -> n.equals(numeros.get(0)));

        System.out.println("Todos os números são iguais? "+ todosDistintos);


    }
}
