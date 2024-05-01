package Pilha;

import java.util.Stack;

public class Pilha {

    public static boolean isBalanced(String input) {
        Stack<Character> stack = new Stack<>();

        for (char c : input.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                if (stack.isEmpty() || stack.pop() != '(') {
                    return false; // Encontramos um ')' sem correspondência.
                }
            } else {
                return false; // Caractere inválido encontrado.
            }
        }

        return stack.isEmpty(); // A string está balanceada se a pilha estiver vazia.
    }

}
