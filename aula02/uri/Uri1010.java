package uri;

import java.util.Scanner;

public class Uri1010 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int qtde1, qtde2;
        double valor1, valor2, total;

        // System.out.println("Entre com o Código, Qtde e Valor da peça 1: ");
        entrada.nextInt();
        qtde1 = entrada.nextInt();
        valor1 = entrada.nextDouble();
        // System.out.println("Entre com o Código, Qtde e Valor da peça 2: ");
        entrada.nextInt();
        qtde2 = entrada.nextInt();
        valor2 = entrada.nextDouble();

        total = ((qtde1 * valor1) + (qtde2 * valor2));

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", total);

    entrada.close(); 
    }
    
}
