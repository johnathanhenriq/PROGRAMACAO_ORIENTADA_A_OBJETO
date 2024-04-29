package Q32_ClasseGenerica;

public class TresAtributos<T> {
    private T atributo1;
    private T atributo2;
    private T atributo3;

    public TresAtributos(T atributo1, T atributo2, T atributo3) {
        this.atributo1 = atributo1;
        this.atributo2 = atributo2;
        this.atributo3 = atributo3;
    }

    public int contarIguais() {
        int iguais = 0;
        if (atributo1.equals(atributo2)) {
            iguais++;
        }
        if (atributo1.equals(atributo3)) {
            iguais++;
        }
        if (atributo2.equals(atributo3)) {
            iguais++;
        }
        return iguais;
    }

    public void imprimir() {
        System.out.println("Atributo 1: " + atributo1);
        System.out.println("Atributo 2: " + atributo2);
        System.out.println("Atributo 3: " + atributo3);
    }

}

