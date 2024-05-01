package Questao45;

public class Circulo extends FiguraGeometrica{
    private int raio;

    public Circulo(int lados, int bordas, int raio){
        super(lados, bordas);
        this.raio = raio;
    }

    public void desenha(){
        System.out.println("Isto é um Circulo");
    }

    @Override
    public String toString(){
        return super.toString() + "Raio: " + this.raio;
    }
    
}
