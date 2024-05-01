package LivroLivraria;

public class Livro {

    private int qntPaginas;
    private int issn;
    private String titulo;


    public Livro (int qntPaginas, int issn, String titulo){

        this.qntPaginas = qntPaginas;
        this.issn = issn;
        this.titulo = titulo;
    }


    @Override
    public String toString(){
        return " Quantidade de página" + this.qntPaginas  + "\n" +
                "ISSN "+ this.issn +"\n Titulo " + this.titulo;
    }
    

}
