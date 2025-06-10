public class Main {
    public static void main(String[] args) throws ExcecaoPilhaVazia {
       try {
            Pilha<Integer> i = new Pilha<Integer>(5);
            i.push(10);
            i.push(20);
            i.pop();
            i.pop();
            i.pop();
       } catch (Exception e) {
            System.out.println("Pilha Vazia");
       }
    }
}