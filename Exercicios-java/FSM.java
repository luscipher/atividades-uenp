import java.util.Scanner;
public class FSM {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            State s = new State();
            System.out.print("Digite uma palavra com pelo menos 6 letras: ");
            String w = input.nextLine();
            if (w.length() < 6) {
                System.out.println("A palavra deve ter pelo menos 6 letras.");
                return;
            }
            s.setWord(w);
            int state = 1; // estado inicial
            for (int i = 0; i < 6; i++) {
                state = s.process((char) (state));
            }
            boolean result = (state == 1); // define se o estado final é de aceitação
            if (result) {
                System.out.println("ACCEPTED");
            } else {
                System.out.println("REJECTED");
            }
        }
    }
}

class State {
    private String word;
    public void setWord(String word) {
        this.word = word;
    }
    public String getWord() {
        return word;
    }
    public int process(char q) {
        switch (q) {
            case 1 -> {
                if (word.charAt(0) == 'a') {
                    return 1;
                }
                if (word.charAt(0) == 'b') {
                    return 0;
                }
            }
            case 2 -> {
                if (word.charAt(1) == 'a') {
                    return 0;
                }
                if (word.charAt(1) == 'b') {
                    return 1;
                }
            }
            case 3 -> {
                if (word.charAt(2) == 'a') {
                    return 0;
                }
                if (word.charAt(2) == 'b') {
                    return 1;
                }
            }
            case 4 -> {
                if (word.charAt(3) == 'a') {
                    return 0;
                }
                if (word.charAt(3) == 'b') {
                    return 1;
                }
            }
            case 5 -> {
                if (word.charAt(4) == 'a') {
                    return 0;
                }
                if (word.charAt(4) == 'b') {
                    return 1;
                }
            }
            case 6 -> {
                if (word.charAt(5) == 'a') {
                    return 0;
                }
                if (word.charAt(5) == 'b') {
                    return 1;
                }
            }
        }
        return -1;
    }
}