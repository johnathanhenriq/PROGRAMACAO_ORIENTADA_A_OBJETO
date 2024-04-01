package Questao9;
import java.util.Scanner;
public class Cartas {

    public static void main(String[] args) {
        String nomeCarta = "";
        String nomeNaipe = "";

        Scanner scanner = new Scanner(System.in);

        int valorCarta = scanner.nextInt();
        int naipe = scanner.nextInt();

     switch (valorCarta) {
        case 1:
        nomeCarta = "Ás";
        break;
        case 2:
        nomeCarta = "Dois";
        break;
        case 3:
        nomeCarta = "Três";
        break;
        case 4:
        nomeCarta = "Quatro";
        break;
        case 5:
        nomeCarta = "Cinco";
        break;
        case 6:
        nomeCarta = "Seis";
        break;
        case 7:
        nomeCarta = "Sete";
        break;
        case 8:
        nomeCarta = "Oito";
        break;
        case 9:
        nomeCarta = "Nove";
        break;
        case 10:
        nomeCarta = "Dez";
        break;
        case 11:
        nomeCarta = "Valete";
        break;
        case 12:
        nomeCarta = "Dama";
        break;
        case 13:
        nomeCarta = "Rei";
            break;
        default:
        nomeCarta = "Carta inválida";
            break;
     }

     switch (naipe) {
        case 1:
        nomeNaipe = "Ouro";
        break;

        case 2:
        nomeNaipe = "Paus";
        break;

        case 3:
        nomeNaipe = "Copas";
        break;

        case 4:
        nomeNaipe = "Espadas";
            
            break;
     
        default:
        nomeNaipe =  "Naipe não existe";
            break;
     }

     System.out.println("Sua carta é: " + nomeCarta + " de " + nomeNaipe + ".");

     scanner.close();

        
    }
    
}
