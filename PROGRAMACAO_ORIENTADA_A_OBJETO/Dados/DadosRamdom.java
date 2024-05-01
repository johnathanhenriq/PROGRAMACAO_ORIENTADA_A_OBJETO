package Dados;

import java.util.Random;

public class DadosRamdom {

    public static void main(String[] args) {
        Random random = new Random();
        int[] frequencia = new int[13]; // Índices de 2 a 12

        for (int i = 0; i < 6; i++) {
            int dado1 = random.nextInt(6) + 1; // Gerar valor do dado 1 (1 a 6)
            int dado2 = random.nextInt(6) + 1; // Gerar valor do dado 2 (1 a 6)
            int soma = dado1 + dado2;
            frequencia[soma]++;
        }

        System.out.println("Soma\tFrequência");
        for (int i = 2; i <= 12; i++) {
            System.out.println(i + "\t" + frequencia[i]);
        }
    }
}
