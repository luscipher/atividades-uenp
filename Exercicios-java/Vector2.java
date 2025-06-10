import java.util.Collections;
import java.util.Vector;
public class Vector2 {
    public static void main(String[]v) {
        //lê um vetor de inteiros com 20 posições, escreva cada item do vetor
        Vector<Integer> vetI = new Vector<>(20);
        vetI.add(1);        vetI.add(2);
        vetI.add(3);        vetI.add(4);
        vetI.add(5);        vetI.add(6);
        vetI.add(7);        vetI.add(8);
        vetI.add(9);        vetI.add(10);
        vetI.add(11);       vetI.add(12);
        vetI.add(13);       vetI.add(14);
        vetI.add(15);       vetI.add(16);
        vetI.add(17);       vetI.add(18);
        vetI.add(19);       vetI.add(20);
        System.out.println("Vetor inicial: " + vetI);
        // Troca os elementos,  elemento 1 por 20, 2 por 19, etc.
        Collections.swap(vetI, 0, 19);        Collections.swap(vetI, 1, 18);
        Collections.swap(vetI, 2, 17);        Collections.swap(vetI, 3, 16);
        Collections.swap(vetI, 4, 15);        Collections.swap(vetI, 5, 14);
        Collections.swap(vetI, 6, 13);        Collections.swap(vetI, 7, 12);
        Collections.swap(vetI, 8, 11);        Collections.swap(vetI, 9, 10);
        // escreve o vetor modificado
        System.out.println("Vetor final = "+vetI);
    }
}