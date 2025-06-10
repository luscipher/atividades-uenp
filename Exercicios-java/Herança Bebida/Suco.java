public class Suco extends Bebida{
    private String fruta;
    public Suco(){
        super();
        fruta = "";
    }
    public Suco(String marca, String nome, String fruta){
        super(marca, nome);
        this.fruta = fruta;
    }
    public void setFruta(String fruta){
        this.fruta = fruta;
    }
    public String getFruta(){
        return  fruta;
    }
}
