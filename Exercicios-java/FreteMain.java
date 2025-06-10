public class FreteMain {
    public static void main(String[] args) {
        Frete f = new Frete();
        f.recebeComp(85);
        f.recebeCep("86300-000");

        float frete = f.calcularFrete();
        System.out.println("Valor do frete: " + frete);
    }
}

class Frete {
    String cep;
    char primeiraLetra;
    float valorComp;

    public void recebeComp(float v) {
        this.valorComp = v;
    }

    public void recebeCep(String c) {
        this.cep = c;
    }

    private float obterRegiao() {
        this.primeiraLetra = cep.charAt(0);
        if (primeiraLetra == '1' || primeiraLetra == '2' || primeiraLetra == '3') {
            return valorComp * 3;
        } else if (primeiraLetra == '4' || primeiraLetra == '5' || primeiraLetra == '6') {
            return valorComp * 4;
        } else if (primeiraLetra == '7') {
            return valorComp * 5;
        } else if (primeiraLetra == '8' || primeiraLetra == '9') {
            return valorComp * 2;
        } else {
            return valorComp; // valor padrão se não entrar em nenhum caso
        }
    }

    public float calcularFrete() {
        float valorRegiao = obterRegiao();
        return valorRegiao / 100;
    }
}
