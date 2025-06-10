public class Lista {

    static No lista[] = new No[5];
    static int fim = -1;

    public void cadastra(No p){
        if (fim == -1 || fim < (lista.length-1)){
            fim++;
            lista[fim] = p;
        }
    }
    public void imprime(){
        for (int i = 0; i <= fim; i++) {
            System.out.println("indice:"+i+" "+lista[i].toString());
        }
    }
    public int busca(String nome){
        for (int i = 0; i <= fim ; i++) {
            if (lista[i].toString().contains(nome)){
                return i;
            }
        }
        return 0;
    }
    public void limpaLista(){
        for (int i = 0; i <= fim; i++) {
            lista[i] = null;
        }
        System.out.println("\nlista limpa!");
        fim = -1;
    }
    public No remove(String n){
        int r = busca(n);
        No aux = lista[r];
        for (int i = r; i < fim ; i++) {
            lista[i] = lista[i+1];
        }
        lista[fim] = null;
        fim--;
        return aux;
    }
}