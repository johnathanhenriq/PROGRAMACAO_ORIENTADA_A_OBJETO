package Q31_RegistroAcademico;

public class RegistroAcademico {
    private static int numeroDeMatriculas = 0;
    private int matricula;
    private String nome;
    private int idade;

    public RegistroAcademico(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        this.matricula = ++numeroDeMatriculas;
    }

    public void exibirDados() {
        System.out.println("Matrícula: " + matricula);
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("--------------------");
    }


}

