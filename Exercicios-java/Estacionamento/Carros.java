import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Carros {
    private String placa;
    private LocalDateTime entrada;
    private LocalDateTime saida;
    
    public Carros(String placa) {
        this.placa = placa;
        this.entrada = LocalDateTime.now();
    }
    
    public String getPlaca() {
        return placa;
    }
    
    public LocalDateTime getHoraEntrada() {
        return entrada;
    }
    
    public void registrarSaida() {
        if (saida != null) {
            throw new IllegalStateException("Carro já possui registro de saída");
        }
        this.saida = LocalDateTime.now();
    }
    
    public double calculo() {
        if (saida == null) {
            throw new IllegalStateException("Carro ainda não registrou saída");
        }
        long minutos = entrada.until(saida, ChronoUnit.MINUTES);
        if (minutos <= 60) {
            return 5;
        } else if (minutos <= 120) {
            return 10;
        } else if (minutos <= 180) {
            return 15;
        }
        return 20;
    }
}