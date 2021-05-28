package exercicios;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num1, num2, num3, menor;

        System.out.println("Digite 3 números: ");
        num1 = entrada.nextInt();
        num2 = entrada.nextInt();
        num3 = entrada.nextInt();

        menor = encontrarMenor(num1, num2, num3);

        System.out.println("O menor valor é " + menor);

        entrada.close();
    }

    static int encontrarMenor(int a, int b, int c) {
        int menor;

        if (a <= b && a <= c) {
            menor = a;
        } else {
            if (b <= a && b <= c) {
                menor = b;
            } else {
                menor = c;
            }
        }
        return menor;
    }
}
