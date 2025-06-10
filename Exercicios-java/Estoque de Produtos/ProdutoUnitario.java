public class ProdutoUnitario extends Produto implements InterfaceProduto{

    private Integer quantidadeEstoque;
    public ProdutoUnitario(Integer codigo, String nome, Double preco, Integer quantidadeEstoque){
        super(codigo, nome, preco);
        setQuantidadeEstoque(quantidadeEstoque);
    }
    public void adicionarEstoque(Integer quantAdd){
        quantidadeEstoque += quantAdd;
    }
    public void vender(Integer quantVendido){
        quantidadeEstoque -= quantVendido;
    }

    public Integer getQuantidadeEstoque() {
        return quantidadeEstoque;
    }
    public void setQuantidadeEstoque(Integer quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    @Override
    public double calcularValorEmEstoque() {
        return getQuantidadeEstoque() * (super.getPreco());
    }

}