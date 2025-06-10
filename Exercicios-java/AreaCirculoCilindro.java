public class AreaCirculoCilindro {
        public static void main(String[] args) {
            Circulo cir = new Circulo(0.0, 2.0, 3.14);
            Cilindro cil = new Cilindro(0.0, 2.0, 3.14, 13.0);
            System.out.println(cir.calcularArea());
            System.out.println(cil.calcularArea());
            cil.getArea();
        }
}

class Circulo {
    public Double A;
    private Double r;
    private Double p;
    public Circulo(){
        this.r = 0.0;
    }
    public Circulo(Double A, Double r, Double p) {
        this.A = A;
        this.r = r;
        this.p = p;
    }
    public Double getRaio() {
        return r;
    }
    public Double getPi() {
        return p;
    }
    public Double calcularArea(){
        Double A = getPi() *(getRaio()*getRaio());
        return A;
    }
}

class Cilindro extends Circulo{

    private Double Altura;
    private Double A;

    public Cilindro(){
        super();
        Altura = 0.0;
    }
    public Cilindro(Double A, Double r, Double p, Double Altura){
        super(A,r,p);
        this.Altura = Altura;
    }
    public Double getAltura(){
        return Altura;
    }
    public Double calcularArea(){
        Double A = 2*(getPi()*(getRaio()*getRaio())) + 2*(getPi()*getRaio()*getAltura());
        return A;
    }
    public Double getArea() {
        return A;
    }
}