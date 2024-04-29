package Q12_DiaDaSemana;

import java.util.Scanner;

public class DiaDaSemana {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número de um dia do mês de fevereiro de 2015 (entre 1 e 28):");
        int dia = scanner.nextInt();

        int ano = 2015;
        int mes = 2; // fevereiro

        int diaSemana = calcularDiaSemana(dia, mes, ano);

        String nomeDiaSemana = obterNomeDiaSemana(diaSemana);

        System.out.println("O dia " + dia + " de fevereiro de 2015 será um(a) " + nomeDiaSemana + ".");

        scanner.close();
    }

    public static int calcularDiaSemana(int dia, int mes, int ano) {
        if (mes == 1 || mes == 2) {
            mes += 12;
            ano--;
        }

        int k = ano % 100;
        int j = ano / 100;

        int h = (dia + 13 * (mes + 1) / 5 + k + k / 4 + j / 4 + 5 * j) % 7;

        return h;
    }

    public static String obterNomeDiaSemana(int diaSemana) {
        switch (diaSemana) {
            case 0:
                return "Sábado";
            case 1:
                return "Domingo";
            case 2:
                return "Segunda-feira";
            case 3:
                return "Terça-feira";
            case 4:
                return "Quarta-feira";
            case 5:
                return "Quinta-feira";
            case 6:
                return "Sexta-feira";
            default:
                return "Erro";
        }
    }
}
