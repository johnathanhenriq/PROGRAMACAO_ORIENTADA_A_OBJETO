package CartaoMegaSena;

public class CartaoMegaSena {

    public static void main(String[] args) {
        int[][] cartao = new int[6][10];
        int numero = 1;

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 10; j++) {
                cartao[i][j] = numero;
                numero++;
            }
        }

        // Imprime o cartão da Mega-Sena
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.printf("%2d ", cartao[i][j]); // Formatação para ocupar 2 espaços
            }
            System.out.println(); // Nova linha para a próxima linha do cartão
        }
    }
}
