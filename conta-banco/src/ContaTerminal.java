import java.util.Scanner;

public class ContaTerminal {
	
	 private int numero;
	    private String agencia;
	    private String nomeCliente;
	    private double saldo;

	    public ContaTerminal(int numero, String agencia, String nomeCliente, double saldo) {
	        this.numero = numero;
	        this.agencia = agencia;
	        this.nomeCliente = nomeCliente;
	        this.saldo = saldo;
	    }

	    public void depositar(double valor) {
	        this.saldo += valor;
	    }

	    public void sacar(double valor) {
	        if (valor <= saldo) {
	            this.saldo -= valor;
	        } else {
	            System.out.println("Saldo insuficiente.");
	        }
	    }

	    public void imprimirExtrato() {
	        System.out.println("===========================================");
	        System.out.println("Agência: " + this.agencia);
	        System.out.println("Número: " + this.numero);
	        System.out.println("Nome do Cliente: " + this.nomeCliente);
	        System.out.println("Saldo atual: R$" + this.saldo);
	        System.out.println("===========================================");
	    }

	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        System.out.println("Digite o número da conta:");
	        int numero = input.nextInt();

	        System.out.println("Digite a agência:");
	        String agencia = input.next();

	        System.out.println("Digite o nome do cliente:");
	        String nomeCliente = input.next();	     

	        System.out.println("Digite o saldo inicial:");
	        double saldo = input.nextDouble();
	        
	            
	        String mensagem = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " +
	                agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.";

	        System.out.println(mensagem);      
	        
	        ContaTerminal conta = new ContaTerminal(numero, agencia, nomeCliente, saldo);

	        System.out.println("Digite a operação desejada:");
	        System.out.println("1 - Depositar");
	        System.out.println("2 - Sacar");
	        System.out.println("3 - Imprimir Extrato");
	        System.out.println("0 - Sair");

	        int operacao = input.nextInt();

	        while (operacao != 0) {
	            switch (operacao) {
	                case 1:
	                    System.out.println("Digite o valor a ser depositado:");
	                    double valorDeposito = input.nextDouble();
	                    conta.depositar(valorDeposito);
	                    break;
	                case 2:
	                    System.out.println("Digite o valor a ser sacado:");
	                    double valorSaque = input.nextDouble();
	                    conta.sacar(valorSaque);
	                    break;
	                case 3:
	                    conta.imprimirExtrato();
	                    break;
	                default:
	                    System.out.println("Operação inválida.");
	                    break;
	            }

	            System.out.println("Digite a operação desejada:");
	            operacao = input.nextInt();
	        }

	        System.out.println("Encerrando o programa.");
	    }
	

}
