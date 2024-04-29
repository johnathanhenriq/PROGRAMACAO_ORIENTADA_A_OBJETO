package Questao16;

public class CrescimentoPopulacional {
    public static void main(String[] args) {
        int populacaoA = 7000;
        int populacaoB = 20000;
        int anos = 0;

        while (populacaoA < populacaoB) {
            populacaoA += (int) (populacaoA * 0.035); // Crescimento de 3,5%
            populacaoB += (int) (populacaoB * 0.01); // Crescimento de 1%
            anos++;
        }

        System.out.println("A cidade A ultrapassará ou igualará a população da cidade B em " + anos + " anos.");
        System.out.println("População da cidade A: " + populacaoA);
        System.out.println("População da cidade B: " + populacaoB);
    }
}

