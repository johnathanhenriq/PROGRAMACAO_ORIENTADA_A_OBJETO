package Veiculos;

public  abstract class Aereo extends Veiculo {

    private int altura;


    public Aereo(int capacidade, int altura){
        super(capacidade);
        this.altura = altura;

    }

    @Override
    public String toString(){
        return super.toString() + "Altura: " + this.altura + "\n";
    }
    
}
