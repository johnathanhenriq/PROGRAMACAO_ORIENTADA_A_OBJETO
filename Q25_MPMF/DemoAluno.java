package Q25_MPMF;

public class DemoAluno{

    public static void main(String[] args) {
        Aluno aluno1 = new Aluno(123, "João", 6.5, 7.0, 8.0);
        Aluno aluno2 = new Aluno(456, "Maria", 4.0, 5.5, 6.0);

        System.out.println("Aluno 1:");
        System.out.println("Média Parcial: " + aluno1.media());
        System.out.println("Nota necessária na Prova Final: " + aluno1.provaFinal());

        System.out.println("\nAluno 2:");
        System.out.println("Média Parcial: " + aluno2.media());
        System.out.println("Nota necessária na Prova Final: " + aluno2.provaFinal());
    }
}