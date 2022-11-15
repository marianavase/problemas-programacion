import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int filas = scanner.nextInt();
        int columnas = scanner.nextInt();
        int[][] tablero = new int[filas ][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                tablero[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i <filas ; i++) {
            for (int j = 0; j < columnas; j++) {
                int contadorMinas = 0;
                if(i-1 >=0 && tablero[i-1][j] == 1){
                    contadorMinas++;

                }
                if(j-1 >=0 && tablero[i][j-1] == 1){
                    contadorMinas++;
                }
                if(i-1 >=0 && j-1>=0 && tablero[i-1][j-1] == 1){
                    contadorMinas++;
                }
                if(j-1>=0 && tablero[i][j-1] == 1){
                    contadorMinas++;
                }
                if(j+1<columnas && tablero[i][j+1] == 1){
                    contadorMinas++;
                }
                if(i+1<filas && tablero[i+1][j] == 1){
                    contadorMinas++;
                }
                if(i+1<filas && j+1<columnas && tablero[i+1][j+1] == 1){
                    contadorMinas++;
                }
                System.out.print(contadorMinas + " ");

            }
            System.out.println();

        }







    }
}

/*
4 3
0 1 1
0 0 0
1 0 0
0 1 0

1 1 1
2 3 2
1 2 1
2 1 1
 */
