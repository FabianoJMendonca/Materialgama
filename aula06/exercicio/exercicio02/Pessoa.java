package exercicio.exercicio02;

public class Pessoa {
    private String name, telefone;

    public Pessoa(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;

    }

    public String toString(){
        return nome + " - " + telefone;
    }
}
