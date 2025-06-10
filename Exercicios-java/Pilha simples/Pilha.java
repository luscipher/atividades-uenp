import java.util.ArrayList;
class Pilha< T > {
    final int tam;
    private int topo;
    ArrayList<T> el;
    public Pilha(int tam){
        this.tam = tam;
        this.topo = -1;
        this.el = new ArrayList<T>(tam);
    }
    //empilha
    public void push(T E){
        if(topo < el.size()){
            el.add(E);
        }
    }
    //desempilha
    public T pop() throws ExcecaoPilhaVazia {
        if (topo == -1) {      
            throw new ExcecaoPilhaVazia("Pilha Vazia");
        }else {        
            topo--;
        }
        return el.get(topo--);
    }
}
