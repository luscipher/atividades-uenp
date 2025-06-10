import java.util.Vector;
public class Vector4 {
    public static void main(String[] args) {

        //gabarito de loteria esportiva
        Vector<Integer> G = new Vector<>(13);
        G.add(1);
        G.add(2);
        G.add(3);
        G.add(3);
        G.add(2);
        G.add(1);
        G.add(3);
        G.add(2);
        G.add(1);
        G.add(1);
        G.add(2);
        G.add(3);
        G.add(3);

        //vetor resposta
        Vector<Integer> R = new Vector<>(13);
        R.add(1);
        R.add(2);
        R.add(3);
        R.add(3);
        R.add(2);
        R.add(1);
        R.add(3);
        R.add(2);
        R.add(1);
        R.add(1);
        R.add(2);
        R.add(3);
        R.add(3);

        if ( G.equals(R)){
            System.out.println("GANHADOR, PARABÉNS");
        }else {
            System.out.println("não ganhou.");
        }
    }
}
