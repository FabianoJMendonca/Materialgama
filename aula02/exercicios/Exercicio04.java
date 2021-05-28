package exercicios;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double salario, prestacao, concessao;

        System.out.println("Valor do salário bruto: ");
        salario = entrada.nextDouble();
        System.out.println("Valor da prestação: ");
        prestacao = entrada.nextDouble();

        concessao = (salario * 0.3);

        if (prestacao <= concessao) {
            System.out.println("Empréstimo Aprovado");
         } else {
            System.out.println("Empréstimo Não Aprovado");
        }
        entrada.close();
    }
    
}
