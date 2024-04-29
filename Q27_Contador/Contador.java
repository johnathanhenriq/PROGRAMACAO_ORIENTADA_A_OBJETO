package Q27_Contador;

public class Contador {
    private int valor;

    public Contador() {
        this.valor = 0;
    }

    public void zerar() {
        this.valor = 0;
    }

    public void incrementar() {
        this.valor++;
    }

    public void imprimirValor() {
        System.out.println("Valor do contador: " + this.valor);
    }

}
