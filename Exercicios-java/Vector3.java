import java.util.Collections;
import java.util.Vector;
public class Vector3 {
    public static void main(String[]v) {
        // criar vetor de inteiros de 10 posições
        Vector<Integer> vetI= new Vector<>(10);
        vetI.add(1);
        vetI.add(2);
        vetI.add(3);
        vetI.add(4);
        vetI.add(5);
        vetI.add(6);
        vetI.add(7);
        System.out.println("Vetor a: "+vetI);

        // copia o conteúdo em um segundo vetor de mesmo tamanho.
        Vector<Integer> vetF = new Vector<>(10);
        vetF.add(null);
        vetF.add(null);
        vetF.add(null);
        vetF.add(null);
        vetF.add(null);
        vetF.add(null);
        vetF.add(null);
        Collections.copy(vetF, vetI);
        System.out.println("Vetor b: "+vetF);
    }
}