package Agenda;

public class EntradaEmAgenda {
    private int dia;
    private int mes;
    private int ano;
    private String assunto;


    public EntradaEmAgenda(int dia, int mes, int ano, String assunto){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.assunto = assunto;
    }

    public String toString(){
        return "Dia: " + this.dia + "\nMes:" + this.mes + "\nAno: " + this.ano +
                "\nAssunto: " + this.assunto  + "\n";
    }
 
    public boolean ehNoDia(int dia, int mes, int ano) {
        return this.dia == dia && this.mes == mes && this.ano == ano;
        
    }


}


