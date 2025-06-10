public class Conta {

    public String nomeTitular;
    private Integer numeroConta;
    private Integer numeroAgencia;
    public Double saldoConta;

    public void cadastraConta(String nome, Integer numC, Integer numA, Double saldo) {
        nomeTitular = nome;
        numeroConta = numC;
        numeroAgencia = numA;
        saldoConta = saldo;
    }
    public Double getSaldoConta() {return saldoConta;}
    public void setSaldoConta(Double saldoConta) {this.saldoConta = saldoConta;}

    public String toString(){
        return nomeTitular+" "+numeroAgencia+" "+numeroConta+" Saldo: "+saldoConta;
    }
}
