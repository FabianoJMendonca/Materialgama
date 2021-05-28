package exercicios;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int ladoa, ladob, ladoc;
        boolean ehTriangulo;

        System.out.println("Comprimento lado A do triângulo: ");
        ladoa = entrada.nextInt();
        System.out.println("Comprimento lado B do triângulo: ");
        ladob = entrada.nextInt();
        System.out.println("Comprimento lado C do triângulo: ");
        ladoc = entrada.nextInt();

        ehTriangulo = ladoa <= (ladob + ladoc) && ladob <= (ladoa + ladoc) && ladoc <= (ladoa + ladob);

        if (ehTriangulo) {
                if (ladoa == ladob && ladob == ladoc) {
                    System.out.println("Equilatero");
                } else {
                    if (ladoa == ladob || ladob == ladoc || ladoa == ladoc) {
                        System.out.println("Isosceles");
                    } else {
                        System.out.println("Escaleno");
                    }
                }
            } else {
                System.out.println("Não é um triângulo");
            }
        entrada.close();
    }
}
