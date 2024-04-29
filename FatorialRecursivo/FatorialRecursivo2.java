package FatorialRecursivo;

import java.util.Scanner;

public class FatorialRecursivo2 {


    public static int calcularFatorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * calcularFatorial(n - 1);
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Escreva o valor de n");
        int n = scanner.nextInt();
      
        for (int i = 0; i <= n; i++) {
            int resultado = calcularFatorial(i);
            if (i == 0) {
                System.out.println(i + "! = 1");
            } else {
                System.out.println(i + "! = " + resultado);
            }
        }

        scanner.close();
    }


}

