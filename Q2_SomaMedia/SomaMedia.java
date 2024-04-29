package Q2_SomaMedia;
import java.util.Scanner;

public class SomaMedia {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o valor do número 1 \n");
        int n1 = scanner.nextInt();

        System.out.print("Informe o valor do número 2 \n");
        int n2 = scanner.nextInt();

        System.out.print("Informe o valor do número 3 \n");
        int n3 = scanner.nextInt();


        int soma = n1 + n2 + n3;
        int media = (n1+n2+n3)/3;

        System.out.println("Soma: " + soma + "\n" + "Média: " + media);

        scanner.close();



    }
    
}
