import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroProductos = scanner.nextInt();
        int[] precios = new int[numeroProductos];

        for (int i = 0; i <numeroProductos ; i++) {
            precios[i] = scanner.nextInt();

        }
        int nclientes = scanner.nextInt();
        int[][] pedidos = new int[nclientes][numeroProductos];

        for (int i = 0; i < nclientes; i++) {
            for (int j = 0; j <numeroProductos ; j++) {
                pedidos[i][j]= scanner.nextInt();
            }
        }

        int suma = 0;
        for (int i = 0; i < nclientes; i++) {
            for (int j = 0; j < numeroProductos; j++) {
                suma = suma + pedidos[i][j]*precios[j];
            }
        }
        System.out.println(suma/nclientes);

    }
}
/*
3
10 20 30
2
1 0 1
0 1 1
 */