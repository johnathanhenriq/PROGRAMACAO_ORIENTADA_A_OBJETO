package Q18_PotenciaRecursiva;

import java.util.Scanner;

public class PotenciaRecursiva2 {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a base: ");
        int base = scanner.nextInt();

        System.out.print("Digite o expoente (deve ser maior ou igual a 1): ");
        int expoente = scanner.nextInt();

        if (expoente < 1) {
            System.out.println("O expoente deve ser maior ou igual a 1.");
            return;
        }

        int resultado = potencia(base, expoente);
        System.out.println("O resultado de " + base + " elevado a " + expoente + " é: " + resultado);

        scanner.close();
    }

    public static int potencia(int base, int expoente) {
        // Caso base: se o expoente for 1, retorne a base
        if (expoente == 1) {
            return base;
        } else {
            // Caso recursivo: multiplique a base pelo resultado da potência com expoente - 1
            return base * potencia(base, expoente - 1);
        }
    }
}

