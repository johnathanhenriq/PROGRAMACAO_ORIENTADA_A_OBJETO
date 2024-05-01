package HELLOTHERE;
import java.util.TreeMap;


public class Mapa {

    public static void main(String[] args) {

        TreeMap<Character, Integer> mapa = new TreeMap<>();
        String texto = "HELLO THERE";

        for(char letra : texto.toCharArray()){
            if(Character.isLetter(letra)){
                mapa.put(letra, mapa.getOrDefault(letra, 0)+ 1);
            }
        }

        for (char letra : mapa.keySet()) {
            System.out.println(letra + ": " + mapa.get(letra));
        }
        
    }
    
}
