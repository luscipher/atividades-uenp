public class ExcecaoPilhaVazia extends Exception {
    public ExcecaoPilhaVazia(){
        this("Pilha Vazia");
    }
    public ExcecaoPilhaVazia(String exception) {
        super(exception);
    }
}