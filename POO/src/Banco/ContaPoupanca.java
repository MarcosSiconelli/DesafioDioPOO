package Banco;

public class ContaPoupanca extends Conta{
   
    public ContaPoupanca(Cliente cliente){
        super(cliente);
    }

    public void imprimirextrato(){

            System.out.println("extrato conta poup");
            System.out.println("Titular: "+ cliente.getNome());
            System.out.println("Agencia: "+ agencia);
            System.out.println("Conta: "+ numero);
            System.out.println("Saldo:  "+ saldo);
    
        }

    }



