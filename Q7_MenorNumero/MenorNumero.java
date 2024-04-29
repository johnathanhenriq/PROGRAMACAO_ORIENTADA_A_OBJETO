package Q7_MenorNumero;
import java.util.Scanner;


public class MenorNumero {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite n1: \n");
        int n1 =  scanner.nextInt();

        System.out.println("Digite n2: \n");
        int n2 =  scanner.nextInt();

        System.out.println("Digite n3: \n");
        int n3 =  scanner.nextInt();

        int menor;

        if(n1 < n2 && n1 < n3){
            menor = n1;
        } else if( n2 < n3) {
            menor = n2;
        } else{
            menor = n3;
        }

        System.out.println("O menor é " + menor);

        scanner.close();


        
    }
    
}
