import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int op, loop;
        Estacionamento e = new Estacionamento();
        Scanner input = new Scanner(System.in);

        do {
            System.out.println(" 1 - Entrar no Estacionamento");
            System.out.println(" 2 - Sair do Estacionamento");
            System.out.println(" 3 - Sair do Programa");
            op = input.nextInt();
            switch (op) {
                case 1:
                    do {
                        input.nextLine(); // Limpa o buffer
                        System.out.print("Digite a Placa: ");
                        String placa = input.nextLine();
                        Carros novoCarro = new Carros(placa);

                        if (!e.entraCarro(novoCarro)) {
                            System.out.println("Estacionamento Lotado!");
                            break;
                        }

                        System.out.print("Deseja inserir outro carro? 1-Sim 0-Não: ");
                        loop = input.nextInt();
                    } while (loop == 1);
                    break;
                case 2:
                    e.listarVagas();
                    System.out.print("Digite a vaga do carro que vai sair: ");
                    int vaga = input.nextInt();
                    Carros carroSaida = e.removerCarro(vaga);
                    if (carroSaida != null) {
                        System.out.println(carroSaida.getPlaca() + " deve pagar: R$ " + carroSaida.calculo());
                    } else {
                        System.out.println("Vaga vazia ou inválida!");
                    }
                    break;
            }
        } while (op != 3);
    }
}
