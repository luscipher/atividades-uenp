import java.util.ArrayList;
import java.util.Collections;
public class Principal {
    public static void main(String[] args) {

        ArrayList<Produto> lista = new ArrayList<Produto>();
        ProdutoFracionado p0 = new ProdutoFracionado(611,"tomate", 4.00, 30.0);
        ProdutoUnitario p1 = new ProdutoUnitario(122,"arroz", 10.60, 50);
        ProdutoFracionado p2 = new ProdutoFracionado(431,"batata", 2.40, 50.0);
        ProdutoUnitario p3 = new ProdutoUnitario(232,"feijão", 6.40, 50);
        ProdutoFracionado p4 = new ProdutoFracionado(541,"cebola", 2.50, 45.0);
        ProdutoUnitario p5 = new ProdutoUnitario(380,"óleo", 0.55, 68);
        lista.add(p0);
        lista.add(p1);
        lista.add(p2);
        lista.add(p3);
        lista.add(p4);
        lista.add(p5);

        Collections.sort(lista);
        for (Produto a : lista) {
            System.out.println(a.getCodigo() + " - " + a.getNome());
        }

        p0.adicionarEstoque(5.0);
        p1.adicionarEstoque(10);
        p4.adicionarEstoque(7.0);

        p5.vender(8);
        p2.vender(6.0);
        p3.vender(20);

        int total = 0;
        total += p0.calcularValorEmEstoque();
        total += p1.calcularValorEmEstoque();
        total += p2.calcularValorEmEstoque();
        total += p3.calcularValorEmEstoque();
        total += p4.calcularValorEmEstoque();
        total += p5.calcularValorEmEstoque();
        System.out.println("\nO Valor Total de Estoque é de R$"+total);

    }
}
