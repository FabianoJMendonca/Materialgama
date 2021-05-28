package exercicios.exercicio03;

public class Veiculo {
    // atributos
    String modelo;
    String marca;
    double consumo;
    
    // métodos
    Veiculo(String ml, String mc, double cs) {
        this.modelo = ml;
        this.marca = mc;
        this.consumo = cs;
    }
    void apresentador() {
        System.out.println("Dados do carro: " + modelo +" "+ marca);
    }
    double obterConsumo() {
        return consumo;
    }
    }
