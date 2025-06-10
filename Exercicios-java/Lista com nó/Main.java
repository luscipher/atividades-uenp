class Main {
    public static void main(String[] args) {
        Lista l = new Lista();

        Produto p1 = new Produto();
        p1.preencheProd("arroz", 5.0, 15);
        Produto p2 = new Produto();
        p2.preencheProd("fejao", 5.0, 15);
        Produto p3 = new Produto();
        p3.preencheProd("farinha", 4.50, 5);
        Produto p4 = new Produto();
        p4.preencheProd("leite", 21.0, 10);
        Produto p5 = new Produto();
        p5.preencheProd("ovo", 10.0, 5);

        l.cadastra(new No(p1));
        l.cadastra(new No(p2));
        l.cadastra(new No(p3));
        l.cadastra(new No(p4));
        l.cadastra(new No(p5));
        l.imprime();
        System.out.println("indice: "+l.busca("leite"));
        l.remove("leite");
        l.imprime();
        l.limpaLista();

        l.imprime();

    }
}