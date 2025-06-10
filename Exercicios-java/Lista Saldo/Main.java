public class Main {
    public static void main(String[] args) {
        Lista l = new Lista();
        Conta c1 = new Conta();
        c1.cadastraConta("judith",2021, 14, 20000.00);
        Conta c2 = new Conta();
        c2.cadastraConta("beth",3034, 16, 90000.00);
        Conta c3 = new Conta();
        c3.cadastraConta("jenni",4548, 14, 4500.54);
        Conta c4 = new Conta();
        c4.cadastraConta("camilla",6506, 16, 6666.66);
        Conta c5 = new Conta();
        c5.cadastraConta("gideon",99, 9, 99.99);

        l.cadastra(new No (c1));
        l.cadastra(new No (c2));
        l.cadastra(new No (c3));
        l.cadastra(new No (c4));
        l.cadastra(new No (c5));
        l.imprime();

        System.out.println(l.busca("camilla"));

    }
}
