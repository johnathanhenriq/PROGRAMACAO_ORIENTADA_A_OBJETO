package ItemDeBiblioteca;

public class LivroDeBiblioteca extends Livro implements ItemDeBiblioteca {

    private boolean emprestado;
    private String localizacao;

    public LivroDeBiblioteca(String nome, String titulo, int numeroDePaginas, int anoDaEdicao, String localizao){
        super(titulo, localizao, numeroDePaginas, anoDaEdicao);
        this.emprestado = false;
        this.localizacao = localizao;
    }

    @Override
    public boolean empresta(){
        return emprestado = true;
    }

    @Override
    public boolean estaEmprestado(){
        return emprestado;
    }

    @Override
    public boolean devolve(){
        return emprestado = false;
    }

    @Override
    public String localizacao(){
        return this.localizacao;

    }

    @Override
    public String descricao(){
        return super.qualAutor() + "\t" + super.qualTitulo();
    }

    @Override
    public String toString(){
        return super.toString();
    }




    
}
