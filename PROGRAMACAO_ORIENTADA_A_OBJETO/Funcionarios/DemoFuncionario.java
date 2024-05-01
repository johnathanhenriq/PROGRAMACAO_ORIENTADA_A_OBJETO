package Funcionarios;

public class DemoFuncionario {
    public static void main(String[] args) {
        Assistente assistente = new Assistente("Openai", 2.000 , 1);
        Administrativo administrativo = new Administrativo("verygood", 1.000, 312, "noite");
        Tecnico tecnico = new Tecnico(null, null, 0, null);

        System.out.println(assistente);
        System.out.println(administrativo);
        System.out.println(tecnico);
    }
    
}
