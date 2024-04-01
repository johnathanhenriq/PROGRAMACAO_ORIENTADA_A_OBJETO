package Questao3;
import java.util.Scanner;

public class CalculoTrigonometrico {



    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o ângulo em graus: ");
        double anguloGraus = scanner.nextDouble();

        // Convertendo para radianos
        double anguloRadianos = Math.toRadians(anguloGraus);

        // Calculando as funções trigonométricas
        double seno = Math.sin(anguloRadianos);
        double cosseno = Math.cos(anguloRadianos);
        double tangente = Math.tan(anguloRadianos);
        double cossecante = 1 / seno;
        double secante = 1 / cosseno;
        double cotangente = 1 / tangente;

        System.out.println("Seno: " + seno);
        System.out.println("Cosseno: " + cosseno);
        System.out.println("Tangente: " + tangente);
        System.out.println("Cossecante: " + cossecante);
        System.out.println("Secante: " + secante);
        System.out.println("Cotangente: " + cotangente);

        scanner.close();

        
    }


}


    





