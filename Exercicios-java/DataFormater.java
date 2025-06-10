public class DataFormater {
    public static void main(String[] args) {
        Data dt = new Data();
        dt.fixarData(10, 7, 2001);
        System.out.println("Data: " + dt.mostrarData());

        dt.formatarData(true);
        dt.formatarData(false);
    }
}

class Data {
    int dia;
    int mes;
    int ano;

    void fixarData(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    String mostrarData() {
        return this.dia + "/" + this.mes + "/" + this.ano;
    }

    void formatarData(boolean usarBarra) {
        if (usarBarra) {
            System.out.println(this.dia + "/" + this.mes + "/" + this.ano);
        } else {
            System.out.println(this.dia + "-" + this.mes + "-" + this.ano);
        }
    }   
}