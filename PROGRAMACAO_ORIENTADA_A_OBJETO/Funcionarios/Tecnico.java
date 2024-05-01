package Funcionarios;

public class Tecnico extends Assistente{

    private Double bonusSalarial;

    public Tecnico(String nome, Double salario, int numeroMatricula, Double bonusSalarial){
        super(nome, salario, 0);
        this.bonusSalarial = bonusSalarial;
    }

    public void ganhoAnual(){
        System.out.println("Assistente técnico tem ganho anual.");
    }


    @Override
    public String toString(){
        return super.toString() + "Bonus salarial: " + this.bonusSalarial + "\n";
    }
    
}
