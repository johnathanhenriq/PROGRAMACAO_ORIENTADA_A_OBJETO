package Q24_Fatura;

public class Fatura {
    private String numeroIdentificacao;
    private String descricao;
    private int quantidade;
    private double precoUnitario;

    public Fatura(String numeroIdentificacao, String descricao, int quantidade, double precoUnitario) {
        this.numeroIdentificacao = numeroIdentificacao;
        this.descricao = descricao;
        this.quantidade = quantidade > 0 ? quantidade : 0;
        this.precoUnitario = precoUnitario > 0 ? precoUnitario : 0.0;
    }

    public double calculaTotal() {
        return quantidade * precoUnitario;
    }

    public void imprimirFatura() {
        System.out.println("Número de Identificação: " + numeroIdentificacao);
        System.out.println("Descrição: " + descricao);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Preço Unitário: " + precoUnitario);
        System.out.println("Total da Fatura: " + calculaTotal());
    }

}

