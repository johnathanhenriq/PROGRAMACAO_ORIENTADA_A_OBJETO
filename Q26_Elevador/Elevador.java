package Q26_Elevador;

public class Elevador {
    private int andarAtual;
    private int totalAndares;
    private int capacidade;
    private int pessoasPresentes;

    public Elevador(int capacidade, int totalAndares) {
        this.capacidade = capacidade;
        this.totalAndares = totalAndares;
        this.andarAtual = 0;
        this.pessoasPresentes = 0;
    }

    public void entra() {
        if (pessoasPresentes < capacidade) {
            pessoasPresentes++;
            System.out.println("Uma pessoa entrou no elevador. Total de pessoas: " + pessoasPresentes);
        } else {
            System.out.println("O elevador está cheio. Não é possível entrar.");
        }
    }

    public void sai() {
        if (pessoasPresentes > 0) {
            pessoasPresentes--;
            System.out.println("Uma pessoa saiu do elevador. Total de pessoas: " + pessoasPresentes);
        } else {
            System.out.println("Não há ninguém no elevador para sair.");
        }
    }

    public void sobe() {
        if (andarAtual < totalAndares) {
            andarAtual++;
            System.out.println("Elevador subiu para o andar " + andarAtual);
        } else {
            System.out.println("O elevador já está no último andar. Não é possível subir.");
        }
    }

    public void desce() {
        if (andarAtual > 0) {
            andarAtual--;
            System.out.println("Elevador desceu para o andar " + andarAtual);
        } else {
            System.out.println("O elevador já está no térreo. Não é possível descer.");
        }
    }

}

