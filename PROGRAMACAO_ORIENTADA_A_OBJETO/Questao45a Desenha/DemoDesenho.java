package Questao45a;

public class DemoDesenho {
    public static void main(String[] args) {
        FiguraGeometrica circulo = new Circulo();
        FiguraGeometrica quadrado = new Quadrado();
        FiguraGeometrica triangulo = new Triangulo();

        Desenho desenho1 = new Desenho(circulo, quadrado, 10, 10, 20, 20);
        Desenho desenho2 = new Desenho(quadrado, triangulo, 30, 30, 40, 40);

        desenho1.apresenta();
        desenho2.apresenta();
    }

    
}
