package Consultorio;

import java.util.Random;

public class DemoConsultorio {
    public static void main(String[] args) {
        Consultorio consultorio = new Consultorio();
        Random random = new Random();

        // Adiciona 20 pacientes ao consultório
        for (int i = 0; i < 20; i++) {
            int idade = random.nextInt(100) + 1; // Idade aleatória de 1 a 99
            String rg = String.format("%07d", random.nextInt(10000000)); // RG aleatório de  dígitos
            Paciente paciente = new Paciente(rg, idade);
            consultorio.adicionarPaciente(paciente);
        }

        int tempoAtual = 0;
        int totalAtendidos = 0;

        while (totalAtendidos < 20 && consultorio.aindaHaPacientes()) {
            Paciente pacienteAtendido = consultorio.atenderProximo();
            if (pacienteAtendido != null) {
                totalAtendidos++;
                System.out.println("Atendendo paciente com RG " + pacienteAtendido.getRg() +
                        " e idade " + pacienteAtendido.getIdade() + ".");
            }
            tempoAtual += 5; // Consulta de 5 minutos
            if (tempoAtual % 4 == 0) { // A cada 4 minutos chega um novo paciente
                int idade = random.nextInt(100); // Idade aleatória de 0 a 99
                String rg = String.format("%7d", random.nextInt(10000000)); // RG aleatório de 7 dígitos
                Paciente novoPaciente = new Paciente(rg, idade);
                consultorio.adicionarPaciente(novoPaciente);
            }
        }

        System.out.println("Total de pacientes atendidos: " + totalAtendidos);
    }
    
}
