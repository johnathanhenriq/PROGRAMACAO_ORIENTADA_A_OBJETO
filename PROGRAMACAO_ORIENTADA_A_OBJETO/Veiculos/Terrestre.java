package Veiculos;

public abstract class Terrestre extends Veiculo {

    int qntRodas;


    public Terrestre(int capacidade, int qntRodas){
        super(capacidade);
        this.qntRodas = qntRodas;

    }

    @Override
    public String toString(){
        return super.toString() + "Quantidade de rodas: " + this.qntRodas + "\n";
    }
     
}
