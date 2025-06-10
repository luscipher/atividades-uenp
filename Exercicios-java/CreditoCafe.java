import java.util.Scanner;
public class CreditoCafe {
    public static void main(String[] args) {
        Cartao card = new Cartao();
        card.addCard();
        while (card.restoCred() > 0){
            Scanner input = new Scanner(System.in);
            System.out.print("Quantidade de café que deseja comprar: ");
            int und = input.nextInt();
            card.comprarCafe(und);
            System.out.println("Credito restante: "+card.restoCred());
            card.reset();   
        }
    }
}

class Cartao {
    int cred;
    int qnt = 0;
    /*cliente adquire cartão cartão inicia com 10 cafes*/
    public void addCard(){
        this.cred = 10;
    }
    public void comprarCafe(int und){
        this.qnt = und;
    }
    /*a cada café retirado da máquina, o saldo do cartão é decrementado*/
    public int restoCred(){
        this.cred = cred-qnt;
        return cred;
    }
    public int reset(){
        this.qnt = 0;
        return qnt;
    }
}