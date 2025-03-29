import java.util.Scanner;

public class Questão2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a quantidade de livros desejados: ");
        int livros = scanner.nextInt();
        
        double descontoA = (0.25 * livros) + 7.50;
        double descontoB = (0.50 * livros) + 2.50;

        if (descontoA > descontoB) {
            System.out.println("O Critério A é a melhor opção.");
        } else if (descontoB > descontoA) {
            System.out.println("O Critério B é a melhor opção.");
        } else {
            System.out.println("Os dois critérios são iguais.");
        }
        
        scanner.close();
    }
}