package Q26_Elevador;

class DemoElevador {
    public static void main(String[] args) {
        Elevador elevador = new Elevador(5, 10);

        elevador.entra();
        elevador.sobe();
        elevador.entra();
        elevador.entra();
        elevador.sobe();
        elevador.entra();
        elevador.sobe();
        elevador.sobe();
        elevador.sai();
        elevador.desce();
        elevador.sai();
        elevador.desce();
        elevador.desce();
    }

     
}