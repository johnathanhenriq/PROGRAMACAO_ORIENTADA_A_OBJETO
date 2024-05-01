package Pilha;

public class DemoPilha  extends Pilha{

    public static void main(String[] args) {
        String input1 = "((()))"; // balanceada
        String input2 = "(()())"; // balanceada
        String input3 = "(())";   // não balanceada
        String input4 = "())(";   // não balanceada

        System.out.println("Input1 está balanceada? " + isBalanced(input1));
        System.out.println("Input2 está balanceada? " + isBalanced(input2));
        System.out.println("Input3 está balanceada? " + isBalanced(input3));
        System.out.println("Input4 está balanceada? " + isBalanced(input4));
    }


}
