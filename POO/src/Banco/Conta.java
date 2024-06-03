package Banco;

public class Conta {
    private static final int agenciapadrao=1;
    private static  int sequencial = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    
    public Conta(Cliente cliente) {
        this.agencia = Conta.agenciapadrao;
        this.numero = sequencial ++;
        this.cliente=cliente;
    }

    public void sacar(double valor){ 
        saldo -= valor;

    }



   

    public void transferir(double valor, Conta contadestino){
        this.sacar(valor);
        contadestino.depositar(valor);
    }

    public void depositar(double valor){
        saldo += valor;
    }



    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void imprimirextrato() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'imprimirextrato'");
    }

    

}
