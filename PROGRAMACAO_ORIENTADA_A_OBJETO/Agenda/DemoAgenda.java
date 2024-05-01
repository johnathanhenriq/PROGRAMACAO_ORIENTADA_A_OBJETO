package Agenda;
import java.util.List;

public class DemoAgenda{
    public static void main(String[] args) {
        Agenda agenda = new Agenda();

        agenda.adicionarCompromisso(8, 24, 3, 2024, "Café da manhã");
        agenda.adicionarCompromisso(10, 24, 3, 2024, "Reunião");
        agenda.adicionarCompromisso(12, 24, 3, 2024, "Almoço");
        agenda.adicionarCompromisso(14, 24, 3, 2024, "Apresentação");
        agenda.adicionarCompromisso(16, 24, 3, 2024, "Visita a clientes");

        System.out.println("Compromissos no dia do seu aniversário (23/03/2024):");
        List<EntradaEmAgenda> compromissosAniversario = agenda.listaDia(24, 3, 2024);
        for (EntradaEmAgenda compromisso : compromissosAniversario) {
            System.out.println(compromisso.toString());
        }
    }
}


