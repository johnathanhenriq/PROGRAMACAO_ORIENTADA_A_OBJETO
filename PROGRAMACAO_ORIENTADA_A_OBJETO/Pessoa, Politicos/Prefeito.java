package Questao41;
public class Prefeito extends Politico {

    private String estado;
    

    public Prefeito (String nome, int cpf, String partido, String estado){
        super(nome, cpf, partido);
        this.estado = estado;

    }

    @Override
    public String toString(){
        return super.toString() + "Estado: " + this.estado + "\n";
    }

    
    
}
