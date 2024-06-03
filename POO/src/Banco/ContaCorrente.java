package Banco;

public class ContaCorrente extends Conta{

    public ContaCorrente(Cliente cliente){
        super(cliente);
    }

    public void imprimirextrato(){
       
         System.out.println("Extrato conta corrente");
     
            System.out.println("Titular: "+ cliente.getNome());
            System.out.println("Agencia: "+ agencia);
            System.out.println("Conta: "+ numero);
            System.out.println("Saldo:  "+ saldo);
    
        }
    
    }


