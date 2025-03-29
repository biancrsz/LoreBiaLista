import java.util.Scanner;

public class Questão9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] idades = new int[10];
        
        System.out.println("Digite a idade de 10 pessoas:");
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Pessoa " + (i+1) + ": ");
            idades[i] = scanner.nextInt();
        }
        
        int maior = idades[0]; 
        
        for (int i = 1; i < 10; i++) {
            if (idades[i] > maior) {
                maior = idades[i];
            }
        }
        
        int soma = 0;
        
        for (int i = 0; i < 10; i++) {
            soma += idades[i];
        }
        
        double media = (double) soma / 10;
        
        int menor = idades[0]; 
        
        for (int i = 1; i < 10; i++) {
            if (idades[i] < menor) {
                menor = idades[i];
            }
        }
        
        System.out.println("\nResultados da análise:");
        System.out.println("a. Maior idade: " + maior + " anos");
        System.out.println("b. Média das idades: " + media + " anos");
        System.out.println("c. Menor idade: " + menor + " anos");
        
        scanner.close();
    }
}