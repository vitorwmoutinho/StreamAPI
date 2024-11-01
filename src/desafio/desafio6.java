package desafio;
/*
Desafio 6 - Verificar se a lista contém algum número maior que 10:
Utilize a Stream API para verificar se a lista contém algum número maior que 10 e exiba o resultado no console.
 */
import java.util.Arrays;
import java.util.List;

public class desafio6 {
    public static void main(String [] args){
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        boolean maiorQueDez = numeros.stream().anyMatch(n -> n > 10);

        if (maiorQueDez) {
            System.out.println("A lista contém pelo menos um número maior que 10.");
        } else {
            System.out.println("A lista não contém números maiores que 10.");
        }
    }
}
