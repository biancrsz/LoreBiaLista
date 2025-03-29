package questão1;

import java.util.Scanner;

public class Questão1 {

    public static void main(String[] args) {
    float n=0, soma=0, media=0, f=0, recu=0;
        
        Scanner s = new Scanner (System.in);
        System.out.println("Insira aqui a sua nota nas últimas três provas: ");
       
        int i;
            for (i=0; i<3; i++){
                n = s.nextFloat();
                soma += n;
            }
            media = (soma/3);
                if (media>=7){
                System.out.println("Parabéns, você foi aprovado!");
            }
                else {
                System.out.println("Reprovado. Feito a prova de recuperação, digite aqui a sua nota:");
                recu = s.nextFloat();
                f = (media+recu)/2;
                
                    if (f>=5){
                    System.out.println("Aprovado pela recuperação");
                }
                    else {
                    System.out.println("Nota insuficiente para ser aprovado.");
                }
            }
        }
    }