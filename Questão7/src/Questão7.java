import java.util.Scanner;

public class Questão7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos contatos deseja cadastrar? ");
        int quantidade = scanner.nextInt();
        scanner.nextLine();

        String[] nomes = new String[quantidade];
        String[] telefones = new String[quantidade];
        
        System.out.println("\n=== Cadastro de Contatos ===");
        for (int i = 0; i < quantidade; i++) {
            System.out.print("Digite o nome do contato " + (i+1) + ": ");
            nomes[i] = scanner.nextLine();
            
            System.out.print("Digite o telefone de " + nomes[i] + ": ");
            telefones[i] = scanner.nextLine();
            System.out.println();
        }
        
        System.out.println("=== Consulta de Telefone ===");
        System.out.print("Digite o nome que deseja consultar: ");
        String nomeBusca = scanner.nextLine();
        
        boolean encontrado = false;
        for (int i = 0; i < quantidade; i++) {
            if (nomes[i].equalsIgnoreCase(nomeBusca)) {
                System.out.println("Telefone de " + nomes[i] + ": " + telefones[i]);
                encontrado = true;
                break;
            }
        }
        
        if (!encontrado) {
            System.out.println("O nome informado não encontrado no banco de dados!");
        }
        
        scanner.close();
    }
}