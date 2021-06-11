package exercicio.exercicio03;

public class ContaPoupanca extends Conta {
    private static double taxa = 0.1; // atributo de classe

    public ContaPoupanca(int numConta) {
        super(numConta);
    }

    public static void setTaxa(double taxa) { // pode ser chamado sem criar um objeto
        ContaPoupanca.taxa = taxa; // se fosse atributo de objeto seria this.taxa
    }
        
    public boolean sacar(double valor) {
        if (getSaldo() >= valor + taxa) {
            return super.sacar(valor + taxa);
        }
        return false; // sem saldo suficiente
    }
}
