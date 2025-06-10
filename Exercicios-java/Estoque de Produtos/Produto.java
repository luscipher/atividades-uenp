abstract class Produto implements Comparable{

    private Integer codigo;
    private String nome;
    private Double preco;

    public Produto(Integer codigo, String nome, Double preco){
        setCodigo(codigo);
        setNome(nome);
        setPreco(preco);
    }
    public Integer getCodigo() {return codigo;}
    public void setCodigo(Integer codigo) {this.codigo = codigo;}
    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}
    public Double getPreco() {return preco;}
    public void setPreco(Double preco) {this.preco = preco;}

    @Override
    public int compareTo(Object o) {
        Produto out = (Produto) o;
        return (codigo - out.getCodigo());
    }
    @Override
    public String toString(){
        return "\n"+this.codigo+" - "+this.nome;
    }
}