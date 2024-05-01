package Questao45;

public class Desenhar {
    private FiguraGeometrica figura;
    private double cordX;
    private double cordY;
    private double raio;
    private double lado;

    public Desenhar(FiguraGeometrica figura, double cordX, double cordY, double raio, double lado){
        this.figura = figura;
        this.cordX = cordX;
        this.cordY = cordY;
        this.raio = raio;
        this.raio = raio;
    }

    @Override
    public String toString(){
        return "Qual Figura: " + this.figura +
                "Coordenada X:" + this.cordX + 
                "\nCoordenada Y:" + this.cordY +
                "Raio: " + this.raio +
                "Qntd. Lados: "+ this.lado + "\n";
    }

    public void apresenta(){
        System.out.println("X: " + this.cordX + "\n" + "Y: " + this.cordY + "\n" +
        "Raio: " + this.raio + "\n" + "lado: " + this.lado);
        this.figura.desenha();
    }
    
}
