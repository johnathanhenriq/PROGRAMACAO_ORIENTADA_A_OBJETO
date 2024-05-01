package Funcionarios;

public class Assistente extends Funcionario {

    private int numeroMatricula;

    public Assistente(String nome, Double salario, int numeroMatricula){
        super(nome, salario);
        this.numeroMatricula = numeroMatricula;
    }

    @Override
    public String toString(){
        return super.toString() + "Número de matricula: " + this.numeroMatricula + "\n";
    }
    
}
