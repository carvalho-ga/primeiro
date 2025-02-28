import java.util.Random;
import java.util.Scanner;

public class Sorte {
  public static void main(String[] args) {
    Scanner leitura = new Scanner(System.in);

    int number = new Random().nextInt(100);
    int tentativas = 5;

    for (int i = 0; i < tentativas; i++) {
      System.out.println("Digite um número entre 0 e 100:");
      int chute = leitura.nextInt();

      if (chute == number) {
        System.out.println("Parabéns! Você acertou!");
        break;
      } else if (chute > number) {
        System.out.println("O número é menor!");
      } else {
        System.out.println("O número é maior!");
      }
    }

    if (tentativas == 5 && number != 0) {
      System.out.println("Você perdeu! O número era " + number);
    }
  }
}
