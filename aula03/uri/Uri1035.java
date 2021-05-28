package uri;

import java.util.Scanner;

public class Uri1035 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numA, numB, numC, numD, somaAB, somaCD;

        numA = entrada.nextInt();
        numB = entrada.nextInt();
        numC = entrada.nextInt();
        numD = entrada.nextInt();

        somaAB = numA + numB;
        somaCD = numC + numD;

        if ((numB > numC) && (numD > numA) && (somaCD > somaAB) && (numC > 0) && (numD > 0) && (numA % 2 ==0)) {
            System.out.println("Valores aceitos");
        } else {
            System.out.println("Valores nao aceitos");
        }
    entrada.close();
    }
}