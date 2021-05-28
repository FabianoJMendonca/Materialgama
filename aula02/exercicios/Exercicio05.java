package exercicios;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        double salario;

        System.out.println("Informe seu salário: ");
        salario = entrada.nextDouble();

        if (salario <= 600.00) {
            System.out.println("Isento de INSS");
        } else {
            if (salario <= 1200.00) {
                System.out.println("Desconto de 20%");
            } else {
                if (salario <= 2000.00) {
                        System.out.println("Desconto de 25%");
                }   else {
                        System.out.println("Desconto de 30%");
                    }
                }
            }
        entrada.close();
    }
}