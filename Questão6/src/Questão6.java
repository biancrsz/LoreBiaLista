import java.util.Scanner;

public class Questão6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] numeros = new int[10];
        
        System.out.println("Insira 10 números inteiros.");
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Insira aqui o " + (i+1) + "º número: ");
            numeros[i] = scanner.nextInt();
        }
        
        System.out.println("\nNúmeros na ordem inversa:");
        
        for (int i = 9; i >= 0; i--) {
            System.out.println(numeros[i]);
        }
        
        scanner.close();
    }
}