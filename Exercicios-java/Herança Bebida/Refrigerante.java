public class Refrigerante extends Bebida{

    private String sabor;
    public Refrigerante(){
        super();
        sabor = "";
    }
    public Refrigerante(String marca, String nome, String sabor){
        super(marca, nome);
        this.sabor = sabor;
    }
    public void setSabor(String sabor){
        this.sabor = sabor;
    }
    public String getSabor(){
        return  sabor;
    }
}
