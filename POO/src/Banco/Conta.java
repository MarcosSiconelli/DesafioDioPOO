package Banco;

public class Conta {
    private static final int agenciapadrao=1;
    private static  int sequencial = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;

    
    public Conta() {
        this.agencia = Conta.agenciapadrao;
        this.numero = sequencial ++;
    }

    public void sacar(double valor){ 
        saldo -= valor;

    }

    public void imprimirextrato (boolean ContaCorrente){
        if (ContaCorrente) {
            System.out.println("xxx extrato conta corrente xxx");
        }
        else {
            System.out.println("xxx extrato conta poupança xxx");
        }

        System.out.println("Agencia: "+ agencia);
        System.out.println("Conta: "+ numero);
        System.out.println("Saldo:  "+ saldo);

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

    

}
