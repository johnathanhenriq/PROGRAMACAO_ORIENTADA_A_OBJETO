package Questao45a;

public class Desenho {

    private FiguraGeometrica figura1;
    private FiguraGeometrica figura2;
    private Double Coord_X1;
    private Double Coord_X2;
    private Double Coord_Y1;
    private Double Coord_Y2;


    public Desenho(FiguraGeometrica figura1, FiguraGeometrica figura2, double Coord_X1, double Coord_Y1, 
    double Coord_X2, double Coord_Y2){
        this.figura1 = figura1;
        this.figura2 = figura2;
        this.Coord_X1 = Coord_X1;
        this.Coord_Y1 = Coord_Y1;
        this.Coord_X2 = Coord_X2;
        this.Coord_Y2 = Coord_Y2;
   
    }

    @Override
    public String toString(){
        return "Figura Geométrica 1: " + this.figura1 +
                "Figura Geométrica 2: " + this.figura2 +
                "\nCoordenada X1: " + this.Coord_X1 +
                "\nCoordenada Y1: " + this.Coord_Y1 +
                "\nCoordenada X2: " + this.Coord_X2 +
                "\nCoordenada Y2: " + this.Coord_Y2;

    }

    public void apresenta() {
        System.out.println("Desenhando figura1 (" + figura1.getClass().getSimpleName() + ") nas coordenadas (" + Coord_X1 + ", " + Coord_Y1 + ")");
        figura1.desenha();
        System.out.println("Desenhando figura2 (" + figura2.getClass().getSimpleName() + ") nas coordenadas (" + Coord_X2 + ", " + Coord_Y2 + ")");
        figura2.desenha();
    }
}

