import java.util.Scanner;

public class While {
  public static void main(String[] args) {
    Scanner leitura = new Scanner(System.in);
    double media = 0;
    double nota = 0;
    int totalDeNotas = 0;

    while (nota >= 0) {
      System.out.println("Digite sua nota para o filme ou -1 para encerrar!");
      nota = leitura.nextDouble();
      
      if (nota >= 0) {
        media += nota;
        totalDeNotas++;
      }
    }

    System.out.println("Média de Notas: " + media / totalDeNotas);
  }
}
