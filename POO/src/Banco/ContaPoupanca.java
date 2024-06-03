package Banco;

public class ContaPoupanca extends Conta{
   
    public void imprimirextrato (){
        System.out.println("xxx extrato conta corrente xxx");
        System.out.println("Agencia: "+ agencia);
        System.out.println("Conta: "+ numero);
        System.out.println("Saldo: %.2f "+ saldo);

    }


}
