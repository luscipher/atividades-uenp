import java.util.Scanner;
public class MediaSimples {
    public static int  media(int v1, int v2, int v3){
        int media = (v1+v2+v3)/3;
        return media;
    }
    public static void  main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Digite primeira nota:");
        int v1 = input.nextInt();
        System.out.println("Digite segunda nota:");
        int v2 = input.nextInt();
        System.out.println("Digite terceira nota:");
        int v3 = input.nextInt();

        int media = media(v1, v2, v3);
        System.out.println("v1: "+v1+" v2: "+v2+" v3: "+v3+" média: "+media);

    }
}