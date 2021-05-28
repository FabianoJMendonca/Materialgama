package exercicios;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int tabuada, cont;

        System.out.println("Digite um número: ");
        tabuada = entrada.nextInt();

        cont = 0;
        while (cont <= 10) {
            // System.err.println(tabuada + " X " + cont + " = " + (tabuada * cont));
            System.err.printf("%d X %02d = %02d\n", tabuada, cont, (tabuada * cont));
            cont++;
        }
        entrada.close(); 
    }
}
