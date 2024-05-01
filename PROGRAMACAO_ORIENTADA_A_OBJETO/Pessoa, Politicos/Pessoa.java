package Questao41;


public class Pessoa {
    private String nome;
    private int cpf;

    public Pessoa( String nome, int cpf){
        this.nome = nome;
        this.cpf = cpf;
    }

    @Override
    public String toString(){
        return "Nome: " + this.nome + "\n" +
                "CPF: " + this.cpf + "\n";

    }
}
