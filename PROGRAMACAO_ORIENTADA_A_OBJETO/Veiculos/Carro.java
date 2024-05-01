package Veiculos;
public class Carro extends Terrestre {

    String placa;

    public Carro(int capacidade, int qntRodas, String placa){
        super(capacidade, qntRodas);
        this.placa = placa;

    }

    public void moverParaFrente(){
        System.out.println("Carro em movimento linear");
    }
    

    @Override
    public String toString(){
        return super.toString() + "Placa: " + this.placa;
    }

}
