package ItemDeBiblioteca;

public class Livro {

    private String titulo;
    private String autor;
    private int numeroDePaginas;
    private int anoDaEdicao;

    public Livro(String titulo, String autor, int numeroDePaginas, int anoDaEdicao){
        this.titulo = titulo;
        this.autor = autor;
        this.numeroDePaginas = numeroDePaginas;
        this.anoDaEdicao = anoDaEdicao;

    }
    public String qualTitulo(){
        return this.titulo;
    }

    public String qualAutor(){
        return this.autor;
    }
    @Override
    public String toString(){
        return "Titulo :" + this.titulo + 
                "\nAutor :" + this.autor + 
                "\nNumero de página: " + this.numeroDePaginas +
                "\nAno de Edição: " + this.anoDaEdicao;
    }
    
}
