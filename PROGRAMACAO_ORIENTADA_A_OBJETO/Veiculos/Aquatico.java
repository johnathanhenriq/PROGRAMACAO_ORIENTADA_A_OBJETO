package Veiculos;

public abstract class Aquatico extends Veiculo {

    int profundidade;

    public Aquatico (int capacidade, int profundidade){
        super(capacidade);
        this.profundidade = profundidade;
    }

    @Override
    public String toString(){
        return super.toString() + "Profundidade: " + this.profundidade + "\n";
    }
    
}
