package exercicios;

import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero, soma, cont;

        System.out.println("Digite o 1o número: ");
        numero = teclado.nextInt();

        soma = 0;
        cont = 2;
        while (numero != 0) {
            soma += numero;
            System.out.println("Digite o " + cont + "o número: ");
            numero = teclado.nextInt();
            cont++;
        }
        System.out.println("A soma dos valores é: " + soma);

        teclado.close();
    }
}
