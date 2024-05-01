package LivroLivraria;

public class TesteApp {
    

    public static void main(String[] args) {
        Livro livro = new Livro( 500, 12345670, "a volta dos que nao foram");
        System.out.println(livro.toString());

        LivroBiblioteca lvb = new LivroBiblioteca(450, 654321, "Mr M", 5, 2013020360);
        System.out.println(lvb.toString());
        System.out.println(lvb);
    }
}
