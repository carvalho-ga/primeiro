public class TempConvert {
  public static void main(String[] args) {
    double celcius = 30.4;
    double convertFahrenheit = (celcius * 1.8) + 32;

    String message = String.format("A temperatura de %f Celsius é equivalente a %f Fahrenheit", celcius, convertFahrenheit);

    System.out.println(message);

    int convertFahrenheitInt = (int) convertFahrenheit;
    System.out.println("A temperatura em Fahrenheit inteira é: " + convertFahrenheitInt);
  }
}
