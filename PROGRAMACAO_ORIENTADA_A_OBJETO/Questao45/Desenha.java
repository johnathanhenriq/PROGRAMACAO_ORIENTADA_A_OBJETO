package Questao45;

public class Desenha {
    public static void desenha(FiguraGeometrica desenhar){
        desenhar.desenha();

    }

    public static void main(String[] args) {
        
        Triangulo triangulo = new Triangulo('0', 0, 0);
        System.out.println(triangulo);
    }
    
}
