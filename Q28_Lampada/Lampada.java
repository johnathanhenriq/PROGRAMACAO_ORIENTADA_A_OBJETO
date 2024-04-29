package Q28_Lampada;

public class Lampada {
    private boolean estadoDaLampada;
    private int vezesAcesa;

    public Lampada() {
        this.estadoDaLampada = false; // Inicialmente desligada
        this.vezesAcesa = 0;
    }

    public void acende() {
        if (!estadoDaLampada) {
            estadoDaLampada = true;
            vezesAcesa++;
        }
    }

    public void apaga() {
        if (estadoDaLampada) {
            estadoDaLampada = false;
        }
    }

    public void mostraEstado() {
        System.out.println("A lâmpada está " + (estadoDaLampada ? "ligada" : "desligada"));
    }

    public boolean estaLigada() {
        return estadoDaLampada;
    }

    public int vezesAcesa() {
        return vezesAcesa;
    }

}
