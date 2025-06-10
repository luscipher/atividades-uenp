import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class Estacionamento {
    private Carros[][] vaga = new Carros[10][2];
    private int nCarros = 0;
    
    public int nCarros() {
        return nCarros;
    }
    
    public boolean entraCarro(Carros carro) {
        for (int i = 0; i < vaga.length; i++) {
            if (vaga[i][0] == null && vaga[i][1] == null) {
                vaga[i][0] = carro;
                nCarros++;
                return true;
            }
        }
        return false;
    }
    
    public boolean getCheio() {
        return nCarros >= vaga.length * 2;
    }
    
    public void remover(int l, int c) {
        if (vaga[l][c] != null) {
            vaga[l][c] = null;
            nCarros--;
        }
    }
    
    public double calcular(int l, int c) {
        if (vaga[l][c] == null) {
            return 0.0;
        }
        LocalDateTime inicio = vaga[l][c].getHoraEntrada();
        LocalDateTime fim = LocalDateTime.now();
        long diferenca = ChronoUnit.MINUTES.between(inicio, fim);
        if (diferenca <= 60) {
            return 5.00;
        } else if (diferenca <= 120) {
            return 10.00;
        } else {
            return 10.00 + (diferenca - 120) * 0.1;
        }
    }
    
    public ArrayList<Carros> listaEstacionados() {
        ArrayList<Carros> lista = new ArrayList<>();
        for (int a = 0; a < vaga.length; a++) {
            if (vaga[a][0] != null) {
                lista.add(vaga[a][0]);
            }
            if (vaga[a][1] != null) {
                lista.add(vaga[a][1]);
            }
        }
        return lista;
    }
    
    public Carros removerCarro(int vaga) {
        if (vaga < 0 || vaga >= this.vaga.length * 2) {
            return null;
        }
        int linha = vaga / 2;
        int coluna = vaga % 2;
        Carros carro = this.vaga[linha][coluna];
        if (carro != null) {
            this.remover(linha, coluna);
            return carro;
        }
        return null;
    }
    
    public void listarVagas() {
        System.out.println("\nEstado das Vagas:");
        for (int i = 0; i < vaga.length; i++) {
            System.out.print("Vaga " + (i * 2) + ": ");
            System.out.println(vaga[i][0] != null ? vaga[i][0].getPlaca() : "vazia");
            System.out.print("Vaga " + (i * 2 + 1) + ": ");
            System.out.println(vaga[i][1] != null ? vaga[i][1].getPlaca() : "vazia");
        }
    }
}