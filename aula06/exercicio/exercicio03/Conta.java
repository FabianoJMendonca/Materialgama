package exercicio.exercicio03;

public class Conta {
    private int numConta;
    private double saldo;

    public Conta(int numConta){
        this.numConta = numConta;
        this.saldo = 0;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getNumConta() {
        return numConta;
    }

    @Override
    public String toString() {
        return numConta + " : " + saldo;
    }

    public boolean depositar(double valor) {
        if(valor > 0) {
            saldo += valor;
            return true;
        }
        return false;
    }

    public boolean sacar(double valor) {
        if(valor > 0) {
            saldo -= valor;
            return true;
        }
        return false;
    }
}
