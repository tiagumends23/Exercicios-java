import java.util.Scanner;

public class Converçaodetemperatura {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite a temperatura em Celsius:");
            double celsius = scanner.nextDouble();
            
            double fahrenheit = (celsius * 9.0/5.0) + 32;
            System.out.printf("%.2fºF equivalem a %.2fºC%n", fahrenheit, celsius);
        
        scanner.close();
        }
    }
}