public class Main {
    public static void main(String[] args) {
        Pilha nPilha = new Pilha(3);

        No no1 = new No("ana", 1);
        No no2 = new No("beatriz", 2);
        No no3 = new No("carla", 3);
        No no4 = new No("dani", 4);

        nPilha.empilha(no1);
        nPilha.empilha(no2);
        nPilha.empilha(no3);
        nPilha.empilha(no4);

        System.out.println("\nConteúdo da pilha:");
        nPilha.imprime();

        System.out.println("\nDesempilhando:");
        nPilha.desempilha();
        nPilha.desempilha();

        System.out.println("\nConteúdo da pilha após desempilhar:");
        nPilha.imprime();
    }
}
