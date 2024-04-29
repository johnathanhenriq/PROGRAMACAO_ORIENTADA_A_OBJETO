package Q28_Lampada;

public class DemoLampada {

    public static void main(String[] args) {
        Lampada lampada = new Lampada();

        lampada.mostraEstado(); // Deve mostrar que a lâmpada está desligada

        lampada.acende();
        lampada.mostraEstado(); // Deve mostrar que a lâmpada está ligada
        System.out.println("Quantidade de vezes que a lâmpada foi acesa: " + lampada.vezesAcesa());

        lampada.acende();
        lampada.mostraEstado(); // Deve manter a lâmpada ligada
        System.out.println("Quantidade de vezes que a lâmpada foi acesa: " + lampada.vezesAcesa());

        lampada.apaga();
        lampada.mostraEstado(); // Deve mostrar que a lâmpada está desligada
    }
    
}
