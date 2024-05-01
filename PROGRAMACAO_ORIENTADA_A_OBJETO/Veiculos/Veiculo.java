package Veiculos;

public abstract class Veiculo {

    private int capacidade;


    public Veiculo(int capacidade){
        this.capacidade = capacidade;
    }
    

    @Override
    public String toString(){
        return "Capacidade: " + this.capacidade + "\n";
    }


    public abstract void moverParaFrente();
}
