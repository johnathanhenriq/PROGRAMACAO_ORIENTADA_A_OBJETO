package MatrizEncapsulada;

public class DemoMatriz extends MatrizEncapsulada{ 

        public DemoMatriz(float a, float b, float c, float d) {
        super(a, b, c, d);
    }

        public static void main(String[] args) {
            DemoMatriz matriz = new DemoMatriz(9,2,3,4);
            System.out.println(matriz.calculaDeterminante());
            matriz.imprimeMatriz();
        }
    
}
