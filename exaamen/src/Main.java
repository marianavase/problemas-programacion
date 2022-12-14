import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       int nivel = scanner.nextInt();
       String comando1 = scanner.next("disable door lock");
        String comando2 = scanner.next("disable alarms");
        String comando3 = scanner.next("disable video surveillance");

       if(nivel==0){
           System.out.println("access denied");
           break;
       }
    }
}