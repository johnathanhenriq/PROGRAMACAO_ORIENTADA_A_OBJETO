package Questao45;

public class DemoFiguraGeometrica {

    public static void main(String[] args) {
        Triangulo triangulo = new Triangulo(3,0,3);
        System.out.println(triangulo);

        Quadrado quadrado = new Quadrado(4, 0, 4);
        System.out.println(quadrado);

        Circulo circulo = new Circulo(0, 0, 5);
        System.out.println(circulo);

        System.out.println(" ");

        Desenha.desenha(triangulo);
        Desenha.desenha(quadrado);
        Desenha.desenha(circulo);

        System.err.println("");


    }
    
}
