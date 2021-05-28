package uri;

import java.util.Scanner;

public class Uri1018 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, nota100, nota50, nota20, nota10, nota5, nota2, nota1;

        numero = entrada.nextInt();
        System.out.println(numero);
    
        nota100 = numero / 100;
        numero = numero % 100;
        nota50 = numero / 50;
        numero = numero % 50;
        nota20 = numero / 20;
        numero = numero % 20;
        nota10 = numero / 10;
        numero = numero % 10;
        nota5 = numero / 5;
        numero = numero % 5;
        nota2 = numero / 2;
        numero = numero % 2;
        nota1 = numero / 1;
        numero = numero % 1; 

        System.out.println( nota100 + " nota(s) de R$ 100,00");
        System.out.println( nota50 + " nota(s) de R$ 50,00");
        System.out.println( nota20 + " nota(s) de R$ 20,00");
        System.out.println( nota10 + " nota(s) de R$ 10,00");
        System.out.println( nota5 + " nota(s) de R$ 5,00");
        System.out.println( nota2 + " nota(s) de R$ 2,00");
        System.out.println( nota1 + " nota(s) de R$ 1,00");

    entrada.close();
}
    
}