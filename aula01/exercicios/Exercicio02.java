package exercicios;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double nota1, nota2, media;

        /* ENTRADA */
        System.out.println("Digite a primeira nota do aluno:");
        nota1 = entrada.nextDouble();
        System.out.println("Digite a segunda nota do aluno:");
        nota2 = entrada.nextDouble();

        /* PROCESSAMENTO */
        media = (nota1 + nota2) / 2;

        /* SAIDA */
        System.out.println("A nota média é " + media);

        entrada.close();
    }

}
