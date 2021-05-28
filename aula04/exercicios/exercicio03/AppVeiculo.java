package exercicios.exercicio03;

public class AppVeiculo {
    public static void main(String[] args) {
        Veiculo v = new Veiculo("Gol", "VM", 12.5);

        v.apresentador();
        System.out.println("Consumo: " + v.obterConsumo());
    }
    
}
