package exercicio.exercicio03;

public class ContaEspecial extends Conta {
    private double limite;
    
    public ContaEspecial(int numConta, double limite){
        
        super(numConta);
        this.limite = limite;
    }
    @Override
    public boolean sacar(double valor) {
        if (getSaldo() + limite >= valor) {
            return super.sacar(valor);
        }
        return false; // sem saldo suficiente
    }

}
