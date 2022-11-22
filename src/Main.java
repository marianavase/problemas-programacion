import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int npregunta = scanner.nextInt();
        int[] valorPregunta = new int[npregunta];

        for (int i = 0; i <npregunta ; i++) {
            valorPregunta[i] = scanner.nextInt();
        }

        int nalumnos = scanner.nextInt();
        int[][] notaAlu = new int[nalumnos][npregunta];
        for (int i = 0; i <nalumnos ; i++) {
            for (int j = 0; j < npregunta; j++) {
                notaAlu[i][j] = scanner.nextInt();

            }
        }

        int[] ntotal = new int[nalumnos];
        for (int i = 0; i < nalumnos; i++) {
            int total= 0;
            for (int j = 0; j < npregunta; j++) {
                total = total + notaAlu[i][j]/valorPregunta[i];
            }
            ntotal[i] = total;
        }

        for (int i = 0; i < nalumnos; i++) {
            System.out.println(ntotal[i]);
        }








    }
}

/*

5
4 5 3 4 5
2
1 2 1 1 1
3 1 3 3 3

 */