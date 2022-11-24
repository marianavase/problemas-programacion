import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int tamanyo = 6;
        String[] emojis = {"🐨","🐒", "🐷", "🦁", "🐱", "🦄", "🦊", "🐼", "🦉", "🐰", "🐶", "🐣", "🐸", "🐙", "🦋" , "🐝","🌻","🪲"};

        int cuantos = tamanyo*tamanyo/2;
        String[][] tablero = new String[tamanyo][tamanyo];
        boolean[][] acertadas = new boolean[tamanyo][tamanyo];


        for (int i = 0; i < cuantos; i++) {
            for (int j = 0; j < 2; j++) {
                for(;;){
                int f1 = random.nextInt(tamanyo);
                int c1 = random.nextInt(tamanyo);
                if(tablero[f1][c1] == null) {
                    tablero[f1][c1] = emojis[i];
                    break;
                     }
                }
            }
        }
//        for (int i = 0; i < tamanyo; i++) {
//            for (int j = 0; j < tamanyo; j++) {
//                System.out.print(tablero[i][j]);
//            }
//            System.out.println();
//        }

        for (int i = 0; i < tamanyo; i++) {
            for (int j = 0; j < tamanyo; j++) {
                System.out.print("\uD83D\uDFEA");
            }
            System.out.println();
        }

        for(;;) {
            int f1 = scanner.nextInt()-1; int c1 = scanner.nextInt()-1; int f2 = scanner.nextInt()-1; int c2 = scanner.nextInt()-1;

            if (tablero[f1][c1].equals(tablero[f2][c2])) {
                acertadas[f1][c1] = true;
                acertadas[f2][c2] = true;
            }

            for (int i = 0; i < tamanyo; i++) {
                for (int j = 0; j < tamanyo; j++) {
                    if (acertadas[i][j]) {
                        System.out.print(tablero[i][j]);
                    }else if(i == f1 && j == c1) {
                        System.out.print(tablero[i][j]);
                    }else if(i == f2 && j == c2){
                        System.out.print(tablero[i][j]);
                    } else {
                        System.out.print("\uD83D\uDFEA");
                    }
                }
                System.out.println();
            }
        }
    }
}

/*
🐨 🐒 🐷 🦁 🐱 🦄 🦊 🐼 🦉 🐰 🐶 🐣 🐸 🐙 🦋
🐒 🐨 🦊 🦁
🦊 🐰 🐰 🐷
🐼 🐼 🦉 🦉
 */