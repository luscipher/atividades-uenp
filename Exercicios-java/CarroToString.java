public class CarroToString {
    public static void  main(String[] args){
        Carro c1 = new Carro();
        Carro c2 = new Carro();
        Carro c3 = new Carro();

        c1.cadadstrar("Ford", "Fiesta", 2010, 4);
        c2.cadadstrar("Toyota", "Corola", 2012, 4);
        c3.cadadstrar("Chevrolet", "Onix", 2018, 4);

        System.out.println(c1.toString());
        System.out.println(c2.toString());
        System.out.println(c3.toString());
    }
}

class Carro {

    String marca;
    String modelo;
    int ano_fabricacao;
    int num_portas;

    public void cadadstrar(String marc, String modl, int ano, int np){
        this.marca = marc;
        this.modelo = modl;
        this.ano_fabricacao = ano;
        this.num_portas = np;
    }
    public String toString(){
        return "\nMarca: "+this.marca+"\nModelo: "+this.modelo+"\nAno: "+this.ano_fabricacao+"\nPortas: "+this.num_portas;
    }
}