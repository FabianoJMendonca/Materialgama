package exercicios;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double salario, novosalario;

        /* ENTRADA */
        System.out.println("Entre com o salário do funcionário: ");
        salario = entrada.nextDouble();

         /* PROCESSAMENTO */
         novosalario = (salario * 0.25) + salario;

         /* SAIDA */
         System.out.println("O novo salário é " + novosalario);
 
         entrada.close();
    }
    
}
