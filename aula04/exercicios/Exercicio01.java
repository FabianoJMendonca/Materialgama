package exercicios;

public class Exercicio01 {
    public static void main(String[] args) {
        Boolean resultado;

        resultado = ehPar(10);

        if(resultado == true) {
            System.out.println("O número é par");
        } else {
            System.out.println("O número é ímpar");
        }
    }

    /*static boolean ehPar(int numero) {
        boolean res;

        if(numero % 2 ==0) {
            res = true;
        } else {
            res = false;
        }
        return res;
    }*/

    /*static boolean ehPar(int numero) {
        if (numero % 2 == 0) {
            return true;
        } 
            return false;
        }*/

        static boolean ehPar(int numero) {
            return (numero % 2 == 0);
    }

}
