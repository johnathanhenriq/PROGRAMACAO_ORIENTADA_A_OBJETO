package Questao45;

public abstract class FiguraGeometrica {
    private int lados;
    private int bordas;


    public  FiguraGeometrica (int lados, int bordas){
        this.lados = lados;
        this.bordas = bordas;
    
        
    }


    @Override
    public String toString(){
        return "Lados: " + this.lados + "\nBordas: " + this.bordas + "\n";
    }

    public abstract void desenha();
    
}
