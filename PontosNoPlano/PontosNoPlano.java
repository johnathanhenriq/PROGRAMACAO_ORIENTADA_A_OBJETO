package PontosNoPlano;
import java.util.Scanner;

public class PontosNoPlano {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor de x1");
        int x1 = scanner.nextInt();

        System.out.println("Digite o valor de y1");
        int y1 = scanner.nextInt();

        System.out.println("Digite o valor de x2");
        int x2 = scanner.nextInt();

        System.out.println("Digite o valor de y2");
        int y2 = scanner.nextInt();

        if (x1 > x2) {
            System.out.println("x1 está a diteita do x2");
            
        }else if(x2 > x1){
            System.out.println("x1 está a esquerda de x2");

        }else{
            System.out.println("os pontos estão no mesmo local");
        }

        if(y1 > y2){
            System.out.println("y2 está abaixo de y1");

        }else if(y2 > y1){
            System.out.println("y2 está acima de y1");

        }else{
            System.out.println("Estão no mesmo ponto");
        }

        scanner.close();
    }


    
}


