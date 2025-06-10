public class ProdutoFracionado extends Produto implements InterfaceProduto{

    private Double quantidadeEstoque;
    public ProdutoFracionado(Integer codigo, String nome, Double preco, Double quantidadeEstoque){
        super(codigo, nome, preco);
        setQuantidadeEstoque(quantidadeEstoque);
    }

    public void adicionarEstoque(Double quantAdd){
        quantidadeEstoque += quantAdd;
    }
    public void vender(Double quantVendido){
        quantidadeEstoque -= quantVendido;
    }

    public Double getQuantidadeEstoque() {
        return quantidadeEstoque;
    }
    public void setQuantidadeEstoque(Double quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    @Override
    public double calcularValorEmEstoque() {
        return getQuantidadeEstoque() * (super.getPreco());
    }

}