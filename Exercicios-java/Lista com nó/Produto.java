public class Produto{
    String nomeProduto;
    double valor;
    int quantidade;
    public void preencheProd(String np, double vl, int qtd){
        nomeProduto = np;
        valor = vl;
        quantidade = qtd;
    }
    public String toString(){
        return "Produto: "+nomeProduto+" Valor: "+valor+" Qtd: "+quantidade;
    }

}