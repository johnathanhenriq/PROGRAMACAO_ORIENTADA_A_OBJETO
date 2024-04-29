package Q27_Contador;

public class DemoContador {

    
    public static void main(String[] args) {
        Contador contador = new Contador();

        contador.imprimirValor(); // Valor inicial do contador

        contador.incrementar();
        contador.incrementar();
        contador.incrementar();
        contador.incrementar();
        contador.imprimirValor(); // Valor após incremento duas vezes

        contador.zerar();
        contador.imprimirValor(); // Valor após zerar
    }
    
}
