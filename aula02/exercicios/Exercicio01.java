package exercicios;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double numero;
        double metade;

    System.out.println("Digite um número: ");
    numero = entrada.nextInt();

    if (numero > 20) {
        metade = (double)numero / 2; // casting = conversão de tipos
        System.out.printf("Metade = %f\n", metade);
    }
    entrada.close(); 
    }
    
}
