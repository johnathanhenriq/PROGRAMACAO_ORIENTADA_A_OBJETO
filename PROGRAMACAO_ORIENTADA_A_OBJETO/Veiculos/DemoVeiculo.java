package Veiculos;
public class DemoVeiculo {

    public static void main(String[] args) {
        Carro carro = new Carro(5, 4, "NQG7473 \n");
        System.out.println(carro);

        Navio navio = new Navio(8, 300, 5);
        System.out.println(navio);

        Aviao aviao = new Aviao(3000, 20000, 12345678);
        System.out.println(aviao);
        System.out.println("\n");


        Controle.controle(aviao);
        Controle.controle(carro);
        Controle.controle(navio);


        System.out.println("");
    }


    

    
}
