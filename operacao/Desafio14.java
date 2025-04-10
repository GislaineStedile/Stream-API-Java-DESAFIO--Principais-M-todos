import java.util.Arrays;
import java.util.List;

public class Desafio14 {
  public static void main(String[] args) {
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
    List<Integer> numerosPrimos = numeros.stream().filter(n-> n < 10 ).toList();
    int maiorNumeroPrimo = numerosPrimos.stream().reduce(0, Integer::max);
    System.out.println("O maior número primo da lista é "+maiorNumeroPrimo);
  }
}
