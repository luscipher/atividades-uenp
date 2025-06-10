import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Hashmap {
    public static void main(String[]args){
        // armazena uma lista de produtos (nome e preço) em uma coleção utilizando HashMap.
        HashMap<String, Double> hash = new HashMap();
        hash.put("Macarrão", 5.00);
        hash.put("Arroz", 4.48);
        hash.put("Feijão", 8.10);
        hash.put("Abobora", 3.98);

        //obtem o preço, dado o nome do produto
        Scanner p = new Scanner(System.in);
        System.out.println("Escolha um produto: ");
        String produto = p.nextLine();
        if ( hash.containsKey( produto ) ) {
            System.out.println("Produto: "+produto+" - Preço: "+hash.get(produto)+"\n");
        }else{
            System.err.println("Produto não existe\n");
        }

        //obtem o produto mais caro do supermercado
        Double maxValueInMap=(Collections.max(hash.values()));
        for (Map.Entry<String, Double> entry : hash.entrySet()) {
            if (entry.getValue()==maxValueInMap) {
                System.out.println("Produto mais caro: "+entry.getKey());
            }
        }
    }
}
