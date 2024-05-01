package Agenda;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private List<EntradaEmAgenda> compromissos;

    public Agenda() {
        this.compromissos = new ArrayList<>();
    }

    public void adicionarCompromisso(int hora, int dia, int mes, int ano, String assunto) {
        EntradaEmAgenda novoCompromisso = new EntradaEmAgenda(dia, mes, ano, assunto);
        this.compromissos.add(novoCompromisso);
    }

    public List<EntradaEmAgenda> listaDia(int dia, int mes, int ano) {
        List<EntradaEmAgenda> compromissosNoDia = new ArrayList<>();
        for (EntradaEmAgenda compromisso : this.compromissos) {
            if (compromisso.ehNoDia(dia, mes, ano)) {
                compromissosNoDia.add(compromisso);
            }
        }
        return compromissosNoDia;
    }
}
