public class ContadorLugares {
    Boolean[] lugares = new Boolean[20];
    public ContadorLugares(){
        for (int index=0; index<=19; index++){
            lugares[index] = false;
        }
    }
    public Integer lugaresVazios(){
        for (int index=0; index<=19; index++){
            if (!lugares[index]){
                return index;
            }
        }
        return 0;
    }
    public synchronized void comprarPassagem(Passageiro nome) throws InterruptedException{
        Integer index = lugaresVazios();
        if (!lugares[index]){
            lugares[index] = true;
            System.out.println(nome.getName()+", comprou a passsagem com sucesso.");
        }else {System.out.println(nome.getName()+", nao conseguiu comprar a passagem.");}
    }
}
