public class Alcoolica extends Bebida{

    private Double teorAlcool;
    public Alcoolica(){
        super();
        teorAlcool = 0.0;
    }
    public Alcoolica(String marca, String nome, Double teorAlcool){
        super(marca, nome);
        this.teorAlcool = teorAlcool;
    }
    public void setTeorAlcool(Double teorAlcool){
        this.teorAlcool = teorAlcool;
    }
    public double getTeorAlcool(){
        return  teorAlcool;
    }
}