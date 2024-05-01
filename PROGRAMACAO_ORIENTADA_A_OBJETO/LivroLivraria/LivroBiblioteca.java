package LivroLivraria;

public class LivroBiblioteca extends Livro {
    
    private int maxEmprestimo;
    private int idCadastro;


    public LivroBiblioteca (int qntPaginas, int issn, String titulo, int maxEmprestimo, int idCadastro){
        super(qntPaginas, issn, null);
        this.maxEmprestimo = maxEmprestimo;
        this.idCadastro = idCadastro;
    }

    @Override

    public String toString(){
        return super.toString() + "Máximo qnt de emprestrimo:" + this.maxEmprestimo + "\n" +
                "ID de cadastro:" + this.idCadastro + "\n";
    }

}





