package LinkedList;
import java.util.LinkedList;

public class Lista {
    public static void main(String[] args) {
        LinkedList<Character> lista = new LinkedList<>();
        LinkedList<Character> listaInversa = new LinkedList<>();
        lista.add('a');
        lista.add('b');
        lista.add('c');
        lista.add('d');
        lista.add('e');
        lista.add('f');
        lista.add('g');
        lista.add('h');
        lista.add('i');
        lista.add('j');

        //System.out.println(lista);

        System.out.println("Lista Original: " + lista);
        for(char item : lista){
            listaInversa.addFirst(item);
        }


        System.out.println("Lista Inversa: " + listaInversa);
        

        
    }
    
}
