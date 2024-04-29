package Q25_MPMF;

public class Aluno {
    private int matricula;
    private String nome;
    private double notaP1;
    private double notaP2;
    private double notaT;

    public Aluno(int matricula, String nome, double notaP1, double notaP2, double notaT) {
        this.matricula = matricula;
        this.nome = nome;
        this.notaP1 = notaP1;
        this.notaP2 = notaP2;
        this.notaT = notaT;
    }

    @Override
    public String toString(){
        return "Matricula: " + this.matricula +
                "Nome: " + this.nome;
    }

    public double media() {
        return (2.5 * notaP1 + 2.5 * notaP2 + 2 * notaT) / 7;
    }

    public double provaFinal() {
        double media = media();
        if (media < 3 || media >= 7) {
            return 0;
        } else {
            double mediaFinal = (media * 6 + 5) / 4;
            return Math.max(0, mediaFinal - media * 4);
        }
    }
}

