package exercicios;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        final int TOTAL_NUMEROS = 10; // constante, não pode alterar o valor
        int numero, pares = 0, impares = 0;

        for (int i = 1; i <= TOTAL_NUMEROS; i++) {
            System.out.printf("Digite o %do número: ", i);
            numero = teclado.nextInt();
            if(numero % 2 == 0) {
                pares++;
            } else {
                impares++;
            }

        }
        System.out.println("O total de pares é: " +pares);
        System.out.println("O total de ímpares é: " +impares);
        teclado.close();
      
    }
    
}