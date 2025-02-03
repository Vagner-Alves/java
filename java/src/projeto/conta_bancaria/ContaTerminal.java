package projeto.conta_bancaria;

import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero;
		String agencia, nomeCliente;
		double saldo;
		
		Scanner teclado = new Scanner(System.in);
		
		// entrada de dados
		System.out.println("por favor, informe o número de sua conta: ");
		numero = teclado.nextInt();
		
		System.out.println("informe o número de sua agencia: ");
		agencia = teclado.next();
		teclado.nextLine();
		
		System.out.println("informe seu Nome: ");
		nomeCliente = teclado.nextLine();
		
		System.out.println("informe seu saldo: ");
		saldo = teclado.nextDouble();
		
		imprimirDadosCliente(nomeCliente, agencia, numero, saldo);

	}
	
	public static void imprimirDadosCliente(String nomeCliente, String agencia, int conta, double saldo) {
		System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco. Sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.", nomeCliente, agencia,conta, saldo); 
	}

}
