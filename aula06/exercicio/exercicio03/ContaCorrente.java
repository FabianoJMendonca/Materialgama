package exercicio.exercicio03;

public class ContaCorrente extends Conta {
    private final double TAXA_DEPOSITO = 0.1;

    public ContaCorrente(int numConta) {
        super(numConta);
    }
    
    @Override
    public boolean sacar(double valor) {
        if (getSaldo() >= valor) {
            return sacar(valor);
        }
        return false; // sem saldo suficiente
    }

    public boolean depositar(double valor) {
        return super.depositar(valor - TAXA_DEPOSITO);
    }
}
