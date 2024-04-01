package Questao4;
import java.util.Scanner;

public class CelciusFahrenheit {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o valor em graus centígrados: \n");
        double grausC = scanner.nextDouble();


        double fahrenheit = (grausC + 5/9) + 32;
        System.out.println(grausC + "°C" + " corresponde a: " + fahrenheit + "°F");

        scanner.close();

        
    }
    
}
