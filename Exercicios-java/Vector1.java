class Vector1 {
    public static void main(String[] args) {
        int vetor[] = {12, 10, 15, 7, 5, 9, 11, 17, 45, 1, 3, 31, 13, 21, 17}; ;
        int res = 0;
        for(int i = 0; i < vetor.length; i++) {
            if(vetor[i]%2 == 0) {
                res *= vetor[i];
            }
        }
        System.out.println(res);
    }
}