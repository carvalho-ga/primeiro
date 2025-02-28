public class MidNote {
  public static void main(String[] args) {
    double nota1 = 12.5;
    int nota2 = 13;
    char nota3 = 'A';
    String nota4 = "B";
    double precoProduto = 13.5;
    int quantidade = 5;
    double valorEmDolares = 5.78;
    double precoOriginal = 999.99;
    double percentualDesconto = 10;

    System.out.println("Média de duas notas double: " + ((int) nota1 + nota2) / 2);
    System.out.println("Notas do semestre foi: " + nota3 + nota4);
    System.out.println(precoProduto * quantidade);
    System.out.println("Mil dólare equivale em reais: " + valorEmDolares * 1000);
    System.out.println("O valor do produto de " + precoOriginal + " com " + percentualDesconto + "% de desconto é: " + precoOriginal * (1 - (percentualDesconto / 100)));
  }
}
