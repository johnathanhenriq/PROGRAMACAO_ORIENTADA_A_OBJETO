package Questao45;

public class Quadrado extends FiguraGeometrica{
    private int qntdLados;


    public Quadrado(int lados, int bordas, int qntdLados){
        super(lados, bordas);
        this.qntdLados = qntdLados;
    }

    public void desenha(){
        System.out.println("Isto é um Quadrado");
    }


    @Override
    public String toString(){
        return super.toString() + "Quantidade de lados: " + this.qntdLados + "\n";
    }
    
}
