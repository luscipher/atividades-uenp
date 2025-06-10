public class RetanguloLados {
    public static void  main(String[] args){
        Retangulo ret = new Retangulo();
        boolean resultado = ret.verificarIgualdade(4, 4);
        System.out.print(resultado);
    }
}
class Retangulo {
    int Lado1;
    int Lado2;
    public boolean verificarIgualdade(int L1, int L2){
        this.Lado1 = L1;
        this.Lado2 = L2;
        return L1 == L2;
    }
}