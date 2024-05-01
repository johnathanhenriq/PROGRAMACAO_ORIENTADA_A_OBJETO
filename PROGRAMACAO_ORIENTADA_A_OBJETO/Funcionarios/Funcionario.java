package Funcionarios;


public abstract class Funcionario {
    private String nome;
    private Double salario;


    public Funcionario(String nome, Double salario){
        this.nome = nome;
        this.salario = salario;

    }


    public double aumentaSalario(double aumento){
        return salario = salario + (salario*aumento)/100;

    }

    public double ganhoAnual(double ganhoAnual){
        return ganhoAnual = salario * 13;
    }

    
    @Override
    public String toString(){
        return "Nome: " + this.nome + "Salário: " + this.salario + "\n";
}

}
