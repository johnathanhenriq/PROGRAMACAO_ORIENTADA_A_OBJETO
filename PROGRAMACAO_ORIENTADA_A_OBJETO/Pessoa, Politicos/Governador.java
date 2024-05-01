package Questao41;
public class Governador extends Politico {
    
String estado;

public Governador (String nome, int cpf, String partido, String estado){
    super(nome, cpf, partido);

}
public String toString(){

return super.toString() + "Estado:  "+ this.estado + "\n";
}

}

