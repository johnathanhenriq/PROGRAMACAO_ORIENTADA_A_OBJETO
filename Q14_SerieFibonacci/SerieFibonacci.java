package Q14_SerieFibonacci;

import java.util.Scanner;

public class SerieFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de n (n > 0): ");
        int n = scanner.nextInt();

        int primeiroTermo = 0;
        int segundoTermo = 1;
        System.out.println("Série de Fibonacci até o " + n + "º termo:");

        if (n >= 1) {
            System.out.print(primeiroTermo + " ");
        }
        if (n >= 2) {
            System.out.print(segundoTermo + " ");
        }

        for (int i = 3; i <= n; i++) {
            int proximoTermo = primeiroTermo + segundoTermo;
            System.out.print(proximoTermo + " ");
            primeiroTermo = segundoTermo;
            segundoTermo = proximoTermo;
        }

        scanner.close();
    }
}
