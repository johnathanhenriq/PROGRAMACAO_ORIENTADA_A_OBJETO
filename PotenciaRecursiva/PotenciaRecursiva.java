package PotenciaRecursiva;

import java.util.Scanner;

public class PotenciaRecursiva {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite o valor da  base:");
        int base = scanner.nextInt();
        System.out.println("Digite o valor do expoente:");
        int expoente = scanner.nextInt();

    
       // int base = 3;
       // int expoente = 4;

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
