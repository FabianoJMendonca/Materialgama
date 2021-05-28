package uri;

import java.util.Scanner;

public class Uri1014 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int distancia;
        double combustivelGasto, consumo;

        distancia = entrada.nextInt();
        combustivelGasto = entrada.nextDouble();

        consumo = distancia / combustivelGasto;

        System.out.printf("%.3f km/l\n", consumo);

    entrada.close(); 
    }
    
}
