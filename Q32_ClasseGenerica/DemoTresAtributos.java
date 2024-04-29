package Q32_ClasseGenerica;

public class DemoTresAtributos {

    
    public static void main(String[] args) {
        TresAtributos<Integer> numeros = new TresAtributos<>(1, 2, 3);
        System.out.println("Quantidade de números iguais: " + numeros.contarIguais());
        numeros.imprimir();

        TresAtributos<String> cores = new TresAtributos<>("vermelho", "azul", "vermelho");
        System.out.println("Quantidade de cores iguais: " + cores.contarIguais());
        cores.imprimir();
    }
    
}
