import java.util.Scanner;

public class Fibonacci {

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero:  ");
        int numero = scanner.nextInt();
        scanner.close();
        if (verificaFibonacci(numero)) {
            System.out.println("O número " + numero + " pertence  à sequência Fibonacci");
        } else {
            System.out.println("O número " + "não pertence  à sequência Fibonacci");
        }
    }
    public static boolean verificaFibonacci(int numero) {
        int a = 0;
        int b = 1;
        while (b < numero){
            int temp = b;
            b = a +b;
            a = temp;
        }
        return b == numero;
    }
}
