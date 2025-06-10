public class Main {
    public static void main(String[] args) {

        Alcoolica a = new Alcoolica("Skol", "Skol Beats", 4.5);
        Refrigerante r = new Refrigerante("Gasosa Paranaense", "Paranaense", "Guaraná");
        Suco s = new Suco("Del Valle", "Del Valle Origens", "Uva");

        System.out.println("Alcoólica: " + a.getNome() + " - Teor: " + a.getTeorAlcool() + "%");
        System.out.println("Refrigerante: " + r.getNome() + " - Sabor: " + r.getSabor());
        System.out.println("Suco: " + s.getNome() + " - Fruta: " + s.getFruta());
    }
}
