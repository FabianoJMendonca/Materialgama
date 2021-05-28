package exercicios;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero, valor;

        System.out.println("Informe o limite: ");
        numero = teclado.nextInt();

        valor = 1;
        while (valor <= numero) {
            System.out.print(valor);
            valor = (valor * 2);
            if(valor <= numero) {
                System.out.print(", ");
            }
        }
        teclado.close(); 
    }
}
