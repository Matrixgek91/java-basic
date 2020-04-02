import java.util.Scanner;

public class Opdracht2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Celcius to Farenheit converter.\n");

        System.out.println("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();

        double farenheit;
        farenheit = (1.8 * celsius) +32;

        System.out.println("\n" +  celsius + "°C is " + farenheit + "°F.");

    }
}
