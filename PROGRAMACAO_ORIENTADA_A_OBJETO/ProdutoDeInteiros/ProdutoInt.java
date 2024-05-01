package ProdutoDeInteiros;

public class ProdutoInt {

    public static int produto(int... numeros) {
        int produto = 1;
        for (int numero : numeros) {
            produto *= numero;
        }
        return produto;
    }

    public static void main(String[] args) {
        System.out.println("Produto de 2, 3 e 4: " + produto(2, 3, 4));
        System.out.println("Produto de 5, 6, 7 e 8: " + produto(5, 6, 7, 8));
        System.out.println("Produto de 9, 10 e 11: " + produto(9, 10, 11));
    }
}

