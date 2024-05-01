package Questao45;

public class Triangulo extends FiguraGeometrica {

    private int qntLados;


    public Triangulo(int lados, int bordas, int qntLados){
        super(lados, bordas);
        this.qntLados = qntLados;
    }

    public void desenha(){
        System.out.println("Isto é um Triângulo");
    }


    @Override
    public String toString(){
        return super.toString() + "Quantidade de lados: " + this.qntLados + "\n";
    }
    
}
