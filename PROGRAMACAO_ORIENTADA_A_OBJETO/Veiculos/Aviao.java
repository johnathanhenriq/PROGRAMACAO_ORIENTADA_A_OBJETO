package Veiculos;
public class Aviao extends Aereo{

    int codAviao;

    public Aviao(int capacidade, int altura, int codAviao){
        super(capacidade, altura);
        this.codAviao = codAviao;


    }

    public void moverParaFrente(){
        System.out.println("Aviao Decolou. ");
    }

    @Override
    public String toString(){
        return super.toString() + "Código de Aviao: " + this.codAviao;
    }
    
}
