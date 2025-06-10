import java.util.Scanner;
public class Matriz1 {
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];

        Scanner ent = new Scanner(System.in);
        System.out.println("Matriz M[3][3]\n");

        for (int l = 0; l < 3; l++) {
            for (int c = 0; c < 3; c++) {
                System.out.printf("Insira o elemento M[%d][%d]: ", l, c);
                matriz[l][c] = ent.nextInt();
            }
        }

        System.out.printf("\n| %d ", matriz[0][0]);
        System.out.printf("| %d |", matriz[0][1]);
        System.out.printf(" %d |", matriz[0][2]);
        System.out.printf("\n| %d ", matriz[1][0]);
        System.out.printf("| %d |", matriz[1][1]);
        System.out.printf(" %d |", matriz[1][2]);
        System.out.printf("\n| %d ", matriz[2][0]);
        System.out.printf("| %d |", matriz[2][1]);
        System.out.printf(" %d |", matriz[2][2]);
    }
}