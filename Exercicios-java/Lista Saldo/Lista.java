public class Lista {

    Conta c = new Conta();
    public No[] lista = new No[5];
    public int fim = -1;

    public void cadastra(No p){
        if (fim == -1 || fim < (lista.length-1)){
            fim++;
            lista[fim] = p;
        }
    }
    public void imprime(){
        for (int i = 0; i <= fim; i++) {
            System.out.println(lista[i].toString());

        }
    }
    public int busca(String nome){
        for (int i = 0; i <= fim ; i++) {
            if (lista[i].toString().contains(nome)){
                System.out.println("\nindex");
                return i;
            }
        }
        return 0;
    }
    public boolean depositar(Double valorDep){
        if(valorDep > 0){
            c.saldoConta = c.saldoConta + valorDep;
            return(true);
        }else{
            return(false);}
    }
    public boolean sacar(double valor){
        if(c.saldoConta>=valor){
            c.saldoConta-=valor;
            return(true);
        }else{
            return (false);
        }
    }

}