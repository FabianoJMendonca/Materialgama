package exemplos;

public class Exemplo03 {
    public static void main(String[] args) {
        // [TIPO] [NOME, NOME2, NOME3, ..]
        int numero; //declarando ou criando uma variável

        numero = 10; // atribuição, guardar um valor na variável

        System.err.println(numero);

        numero = 5; // sobrescreve

        System.err.println(numero);
        // System.err.println(numero + 5);
        numero = numero + 5;
        System.err.println(numero);
    }
    
}
