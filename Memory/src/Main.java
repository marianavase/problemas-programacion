import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[][] Tablero = {
                {"\uD83D\uDC28","\uD83D\uDC12","\uD83D\uDC37","\uD83E\uDD81"},
                {"\uD83D\uDC12","\uD83D\uDC28","\uD83E\uDD8A","\uD83E\uDD81"},
                {"\uD83E\uDD8A","\uD83D\uDC30","\uD83D\uDC30","\uD83D\uDC37"},
                {"\uD83D\uDC3C","\uD83D\uDC3C","\uD83E\uDD89","\uD83E\uDD89"}};
        boolean[][]destapada = new boolean[4][4];


        for(;;) {
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    if (destapada[i][j]) {
                        System.out.print(Tablero[i][j]);
                    } else {
                        System.out.print("\uD83D\uDFEA");
                    }
                }
                System.out.println();
            }


            int f1 = scanner.nextInt()-1;
            int c1 = scanner.nextInt()-1;
            int f2 = scanner.nextInt()-1;
            int c2 = scanner.nextInt()-1;
            if (Tablero[f1][c1].equals(Tablero[f2][c2])) {
                destapada[f1][c1] = true;
                destapada[f2][c2] = true;
            }
        }

    }
}

/*
🐨 🐒 🐷 🦁
🐒 🐨 🦊 🦁
🦊 🐰 🐰 🐷
🐼 🐼 🦉 🦉
 */