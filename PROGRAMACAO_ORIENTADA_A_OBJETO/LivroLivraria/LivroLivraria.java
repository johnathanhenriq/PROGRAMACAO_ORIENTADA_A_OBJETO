package LivroLivraria;

public class LivroLivraria extends Livro {
    
    private int preco;
    private int codBarras;


    public LivroLivraria (int qntPaginas, int issn, String titulo, int preco, int codBarras){
        super(qntPaginas, issn, null);
        this.preco = preco;
        this.codBarras = codBarras;
    }

    @Override

    public String toString(){
        return super.toString() +  "Preço:" + this.preco + "\n" +
                "Código de barras: " + this.codBarras + "\n";
    }



}
