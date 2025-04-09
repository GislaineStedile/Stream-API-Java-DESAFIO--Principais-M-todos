import java.util.Arrays;
import java.util.List;

public class Desafio7 {
  public static void main(String[] args) {
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
    int maior = numeros.stream().reduce(0, Integer::max);
    List<Integer> numeros2 = numeros.stream().filter(n -> n < maior).toList();
    int segundoMaiorNumero = numeros2.stream().reduce(0,Integer:: max);

    System.out.println("O segundo maior número é "+segundoMaiorNumero);
  }
}
