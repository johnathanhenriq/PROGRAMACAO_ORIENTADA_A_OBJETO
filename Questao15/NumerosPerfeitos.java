package Questao15;

public class NumerosPerfeitos {
    public static void main(String[] args) {
        int contador = 0;
        int numero = 2;

        while (contador < 4) {
            if (ehNumeroPerfeito(numero)) {
                System.out.println(numero);
                contador++;
            }
            numero++;
        }
    }

    public static boolean ehNumeroPerfeito(int numero) {
        int somaDivisores = 1; // Começa com 1 porque todo número é divisível por 1
        for (int i = 2; i <= numero / 2; i++) {
            if (numero % i == 0) {
                somaDivisores += i;
            }
        }
        return somaDivisores == numero;
    }
}

