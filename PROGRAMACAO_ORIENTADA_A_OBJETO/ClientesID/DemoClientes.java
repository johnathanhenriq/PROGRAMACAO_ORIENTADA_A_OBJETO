
package ClientesID;
import java.util.Scanner;
import java.util.ArrayList;

public class DemoClientes{

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ArrayList<ClientesId> clientes = new ArrayList<>();

    while (true) {
        System.out.println("Digite o ID do cliente (negativo para sair):");
        int id = scanner.nextInt();
        if (id < 0) {
            break;
        }
        scanner.nextLine(); // Consumir a quebra de linha após o próximoInt()

        System.out.println("Digite o nome do cliente:");
        String nome = scanner.nextLine();

        System.out.println("Digite a idade do cliente:");
        int idade = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha após o próximoInt()

        System.out.println("Digite o telefone do cliente:");
        String telefone = scanner.nextLine();

        ClientesId cliente = new ClientesId(id, nome, idade, telefone);
        clientes.add(cliente);
    }

    scanner.close();

    System.out.println("\nLista de clientes:");
    for (ClientesId cliente : clientes) {
        System.out.println("ID: " + cliente.getId());
        System.out.println("Nome: " + cliente.getNome());
        System.out.println("Idade: " + cliente.getIdade());
        System.out.println("Telefone: " + cliente.getTelefone());
        System.out.println();
    }

    
}



}