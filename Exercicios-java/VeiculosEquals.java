public class VeiculosEquals {
    public static void main(String[] args) {
        Veiculo v1 = new Veiculo("Volvo", 2018, 95_000.0, "kjf100");
        Veiculo v2 = new Veiculo("Ford", 2015, 90_000.0, "kjf100");
        Veiculo v3 = new Veiculo("Chevrolet", 2012, 80_000.0, "ctf230");

        System.out.println(v1.equals(v2)); // true 
        System.out.println(v2.equals(v3)); // false
    }
}

class Veiculo {
    private String placa;
    private String marca;
    private Integer ano;
    private Double valor;

    public Veiculo(){
        this.marca = "";
        this.ano = 0;
        this.valor = 0.0;
        this.placa = "";
    }
    public Veiculo(String marca, Integer ano, Double valor, String placa) {
        this.marca = marca;
        this.ano = ano;
        this.valor = valor;
        this.placa = placa;
    }

    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }
    public String getPlaca() { return placa; }
    public void setPlaca(String placa) { this.placa = placa; }
    public Integer getAno() { return ano; }
    public void setAno(Integer ano) { this.ano = ano; }
    public Double getValor() { return valor;}
    public void setValor(Double valor) { this.valor = valor; }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; 
        if (obj == null || getClass() != obj.getClass()) return false; 
        Veiculo v = (Veiculo) obj;
        return this.placa.equals(v.placa);
    }
}