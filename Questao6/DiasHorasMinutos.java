package Questao6;
import java.util.Scanner;

public class DiasHorasMinutos {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Escreva a quantidade de minutos");
        int minutos = scanner.nextInt();


        int dias = (minutos/ (24*60));
        int horas = (minutos %(24*60)/60);
        int minutosRest = (minutos % 60);
        
        System.out.println(  dias + " Dias. " + "\n" +  horas + " Horas." + "\n"  +  minutosRest +" Minutos. " );

        scanner.close();


    }
    
}
