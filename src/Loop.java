import java.util.Scanner;

public class Loop {
  public static void main(String[] args) {
    Scanner leitura = new Scanner(System.in);
    double media = 0;
    double nota = 0;

    for (int i = 0; i < 3; i++) {
      System.out.println("Qual a sua nota para o filme?");
      nota = leitura.nextDouble();
      media += nota;
    }

    System.out.println("Média de Notas: " + media/3);
  }
}
