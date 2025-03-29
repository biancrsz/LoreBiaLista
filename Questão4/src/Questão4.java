import java.util.Scanner;

public class Questão4 {

    public static void main(String[] args) {
        int num,cont;
        Scanner s = new Scanner(System.in);
        System.out.println("Insira um número que seja maior ou igual a 0: ");
        num = s.nextInt();
        
        if (num<0){
            System.out.println("O número inserido é menor que 0. Não foi possível processar.");
        }
        else {
            cont = digitos(num);
            System.out.println("O número de digitos desse numéro é igual a "+ cont + ".");
            
        }
    }

    private static int digitos(int num) {
        int contador=0;
        if (num==0){
            return 1;
        }
        while (num!=0){
            num/=10;
            contador++;
        }
        return contador;
    }
}