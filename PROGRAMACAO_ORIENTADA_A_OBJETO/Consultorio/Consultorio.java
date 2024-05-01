package Consultorio;

import java.util.ArrayList;
import java.util.List;

public class Consultorio {
    private List<Paciente> filaPrioritaria;
    private List<Paciente> filaComum;

    public Consultorio() {
        filaPrioritaria = new ArrayList<>();
        filaComum = new ArrayList<>();
    }

    public void adicionarPaciente(Paciente paciente) {
        if (paciente.getIdade() > 60) {
            filaPrioritaria.add(paciente);
        } else {
            filaComum.add(paciente);
        }
    }

    public Paciente atenderProximo() {
        if (!filaPrioritaria.isEmpty()) {
            return filaPrioritaria.remove(0);
        } else if (!filaComum.isEmpty()) {
            return filaComum.remove(0);
        } else {
            return null; // Não há mais pacientes para atender
        }
    }

    public boolean aindaHaPacientes() {
        return !filaPrioritaria.isEmpty() || !filaComum.isEmpty();
    }
}

