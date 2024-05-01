package ItemDeBiblioteca;

public interface ItemDeBiblioteca {

    public int maximoDeDiasParaEmprestimo = 14;

    public boolean estaEmprestado();

    public boolean empresta();

    public boolean devolve();

    public String localizacao();

    public String descricao();
    
}
