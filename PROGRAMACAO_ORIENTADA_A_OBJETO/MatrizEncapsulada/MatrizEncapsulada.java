package MatrizEncapsulada;

public abstract class  MatrizEncapsulada {

    private float[][] matriz; 

    public MatrizEncapsulada(float a, float b, float c, float d){
        matriz = new float[][]{{a, b}, {c, d}};
    }

    public float calculaDeterminante(){
        return (matriz[0][0] * matriz[1][1] - (matriz[0][1] * matriz[1][0]));
    }


    public void  imprimeMatriz(){
        for(int i = 0; i < 2; i++){
            System.out.print("| ");
            for(int j = 0; j < 2; j++){
                System.out.printf("  %.0f   ", matriz[i][j]);
            }
            System.out.println("|");
        }
    }

    @Override
    public String toString(){
        return "Valor da matriz[]" + this.matriz;
    }

    
}
