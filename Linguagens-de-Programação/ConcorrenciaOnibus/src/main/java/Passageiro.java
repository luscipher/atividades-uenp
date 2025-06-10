public class Passageiro extends Thread{
    ContadorLugares contador;
    public Passageiro(String nome, ContadorLugares c){
        this.setName(nome);
        this.contador = c;
    }
    @Override
    public void run(){
        try {
            contador.comprarPassagem(this);
        }catch (InterruptedException exception){}
    }
}
