import java.util.Scanner;

public class Fatoriais {
    public static void main(String[] args) {

        System.out.println("fatorial com laço de repetição");
        int n1 = 0;
        Scanner s1 = new Scanner(System.in);
        System.out.println("Informe o número: ");
        n1 = s1.nextInt();
        System.out.println( "O fatorial  de " + n1 + " é: " + fatorialRepeticao ( n1 ) );

        System.out.println("\nfatorial com recurção");
        int n2 = 0;
        Scanner s2 = new Scanner(System.in);
        System.out.println("Informe o número: ");
        n2 = s2.nextInt();
        System.out.println( "O fatorial  de " + n2 + " é: " + fatorialRecursivo ( n2 ) );

        System.out.println("\nfibonacci com repetição");
        int max = 0, n3 = 0;
        Scanner s3 = new Scanner(System.in);
        System.out.println("Informe o número: ");
        max = s3.nextInt();
        System.out.print( fibonacciRepiticao( max, n3 ) );

        System.out.println("\nfibonacci com recurção");
        int n4 = 0;
        Scanner s4 = new Scanner(System.in);
        System.out.println("Informe o número: ");
        n4 = s4.nextInt();
        for (int i = 0; i < n4; i++) {
            System.out.print("(" + i + "):" + Fatoriais.fibonacciRecursivo(i) + "\t");
        }

    }

    public static int fatorialRepeticao ( int n1 ) {
        int f = 1;
        for( int i = 1; i <= n1; i++ ) {
            f *= i;
        }
        return f;
    }
    public static int fatorialRecursivo(int n2) {
        if(n2 == 1){
            return 1;
        }
        return n2 * fatorialRecursivo(n2 - 1);
    }
    public static int fibonacciRepiticao(int max, int n3 ) {
        Scanner scanner = new Scanner(System.in);
        int at = 1, aux = 0, ant = 0;

        System.out.println("pos 1: " + ant);
        for(int i = 2; i < max; i++){
            aux = at;
            at = at + ant;
            ant = aux;
            System.out.println("pos " +i+ ": " +at);
        }
        return n3;
    }
    public static int fibonacciRecursivo( int n4 ) {
        if (n4 < 2) {
            return n4;
        } else {
            return fibonacciRecursivo(n4 - 1) + fibonacciRecursivo(n4 - 2);
        }
    }
}
