import java.util.Arrays;
import java.util.List;

public class Desafio5 {
  public static void main(String[] args) {
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    double maiores = numeros.stream().filter(n -> n > 5).mapToInt(n -> n).average().orElse(0);

    System.out.println("A soma dos numeros maiores que 5: "+maiores);

  }
}
