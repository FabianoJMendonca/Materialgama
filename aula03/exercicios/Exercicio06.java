package exercicios;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        final int TOTAL_NUMEROS = 10;
        int numero, pares = 0, impares = 0;
        double mediaPares = 0, percentualImpares = 0;

        for (int i = 1; i <= TOTAL_NUMEROS; i++) {
            System.out.printf("Digite o %do número: ", i);
            numero = teclado.nextInt();
            if(numero % 2 == 0) {
                pares++;
                mediaPares = (mediaPares + numero);
            } else {
                impares++;
            }
        }
        mediaPares = mediaPares / pares;
        percentualImpares = ((impares / (double)TOTAL_NUMEROS)*100);
        System.out.println("A média dos valores pares é: " + mediaPares);
        System.out.printf("A porcentagem de ímpares é : %.2f %%\n", percentualImpares);
        teclado.close();
    }
    
}
