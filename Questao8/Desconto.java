import java.util.Scanner;
public class Desconto {

    public static void main(String[] args) {


    Scanner scanner = new Scanner(System.in);


    int setor = scanner.nextInt();
    Double valor = scanner.nextDouble();
    

    if(setor == 222 && valor > 500  ){
        valor = valor - (valor*0.1);
        System.out.println("" + valor);
    }
    
    else if (setor == 111 && valor > 100){
        double valorDesconto = valor - (valor * 0.4);
        System.out.println("" + valorDesconto);

    } else if (setor == 111 && valor >= 50 && valor >= 100){
        double valorDesconto = valor - (valor*0.2);
        System.out.println("" + valorDesconto);


    }else if(setor == 111 && valor < 50){
        double valorDesconto = valor - (valor*0.1);
        System.out.println("" + valorDesconto);
    } else{
        System.out.println("Setor invalido");
    }

    scanner.close();

    }

    

}