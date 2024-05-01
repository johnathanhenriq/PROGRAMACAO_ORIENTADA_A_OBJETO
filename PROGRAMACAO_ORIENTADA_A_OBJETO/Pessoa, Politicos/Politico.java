package Questao41;
public class Politico extends Pessoa {

    private String partido;

    public Politico (String nome, int cpf , String partido){
        super(nome, cpf);
        this.partido = partido;

    }

    public String toString(){
         return super.toString() + "Partido: " + this.partido ;
    }
}
