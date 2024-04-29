package AreaDoQuadrado;
import java.util.Scanner;
public class AreaDoQuadrado {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o valor do lado1: \n");
        double lado1 = scanner.nextDouble();

        System.out.print("Informe o valor do lado2: \n");
        double lado2 = scanner.nextDouble();

        double area = lado1 * lado2;


        System.out.println("A área do quadrado é: " + area + " m².");

        scanner.close();



    }




    

}

