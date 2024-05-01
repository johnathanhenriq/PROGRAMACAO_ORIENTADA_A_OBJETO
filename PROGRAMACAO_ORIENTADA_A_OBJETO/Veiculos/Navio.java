package Veiculos;

public class Navio extends Aquatico {

    int qntBotes;

    public Navio(int capacidade, int profundidade, int qntBotes){
        super(capacidade, profundidade);
        this.qntBotes = qntBotes;
    }

    public void moverParaFrente(){
        System.out.println("Navio mover-se para frente");
    }


    @Override
    public String toString(){
        return super.toString() + "Quantidade de botes: " + this.qntBotes + "\n";
    }




    
}
