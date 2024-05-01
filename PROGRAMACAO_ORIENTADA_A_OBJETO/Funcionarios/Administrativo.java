package Funcionarios;

public class Administrativo extends Assistente{

    private String turno;

    public Administrativo(String nome, Double salario, int numeroMatricula, String turno){
        super(nome, salario, 0);
        this.turno = turno;
    }

    public void ganhoAnual(){
        System.out.println("Assistente Admistrativo tem ganho anual.");
    }

    @Override
    public String toString(){
        return super.toString() + this.turno + "\n";
    }

    
}
