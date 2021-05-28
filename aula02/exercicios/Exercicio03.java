package exercicios;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        double numero1, numero2;

        System.out.println("Entre com o primeiro número: ");
        numero1 = entrada.nextDouble();
        System.out.println("Entre com o segundo número: ");
        numero2 = entrada.nextDouble();

        if (numero1 > numero2) {
            System.out.printf("%f, %f\n", numero1, numero2);
        } else {
            System.out.printf("%f, %f\n", numero2, numero1);
        }        
        entrada.close();
    }
}