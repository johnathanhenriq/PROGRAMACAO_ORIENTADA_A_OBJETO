package CentenaDezenaUnidade;
import java.util.Scanner;

public class CentenaDezenaUnidade {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Escreva um número com 3 digitos: \n");
        int numero = scanner.nextInt();

        int centena = (numero / 100);
        int dezena = (numero % 100) / 10;
        int unidade = (numero % 10);

        System.out.printf("%d%d%d", unidade,dezena,centena);



        scanner.close();



        

    }
    
}
