package Banco;

public class Banco {

    private String nome;

    public static void main(String[] args) {
        Conta cc= new ContaCorrente();
        cc.depositar(100);
        cc.imprimirextrato(true);
        Conta cp= new ContaPoupanca();
        cp.imprimirextrato(false);
        cc.transferir(100, cp);
        cp.imprimirextrato(false);
        
    }

}
