public class Matriz2 {

    public static void main(String[] args){
        Matriz M = new Matriz();
        int l4, l2, dp, ds, st;

        l4 = M.linha4();
        System.out.println("Soma total: "+l4);
        l2 = M.linha2();
        System.out.println(" : "+l2);
        dp = M.diagonalP();
        System.out.println("Diagonal Principal: "+dp);
        ds = M.diagonalS();
        System.out.println("Diagonal Secundaria: "+ds);
        st = M.SomaTotal();
        System.out.println("Soma total: "+st);

    }
}

class Matriz {
    int[][] M = {{1,5,6,7,2},{2,1,9,4,5},{7,5,1,8,3},{4,3,6,1,6},{9,5,8,7,1}};

    public int linha4(){
        int l4;
        l4 = M[3][0]+M[3][1]+M[3][2]+M[3][3]+M[3][4];
        return l4;
    }
    public int linha2(){
        int l2;
        l2 = M[1][0]+M[1][1]+M[1][2]+M[1][3]+M[1][4];
        return l2;
    }
    public int diagonalP(){
        int dp;
        dp = M[0][0]+M[1][1]+M[2][2]+M[3][3]+M[4][4];
        return dp;
    }
    public int diagonalS(){
        int ds;
        ds = M[0][4]+M[1][3]+M[2][2]+M[3][1]+M[4][0];
        return ds;
    }
    public int SomaTotal(){
        int st = 0;
        for(int l=0 ; l < 5 ; l++){
            for(int c = 0; c < 5 ; c ++){
                st = st+M[l][c];
            }
        }
        return st;
    }
}