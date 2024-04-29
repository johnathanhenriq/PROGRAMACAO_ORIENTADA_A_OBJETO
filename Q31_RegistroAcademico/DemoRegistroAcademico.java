package Q31_RegistroAcademico;

class DemoRegistroAcademico {

    public static void main(String[] args) {
        RegistroAcademico aluno1 = new RegistroAcademico("João", 20);
        RegistroAcademico aluno2 = new RegistroAcademico("Maria", 22);
        RegistroAcademico aluno3 = new RegistroAcademico("Pedro", 21);

        aluno1.exibirDados();
        aluno2.exibirDados();
        aluno3.exibirDados();
    }

     
}