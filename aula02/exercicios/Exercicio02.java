package exercicios;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double nota1, nota2, media;
    
        System.out.println("Digite nota 1: ");
        nota1 = entrada.nextDouble();
        System.out.println("Digite nota 2: ");
        nota2 = entrada.nextDouble();

        media = ((nota1 * 40) + (nota2 * 60))/100;

        if (media >= 6.0) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
        entrada.close(); 
    }

}
