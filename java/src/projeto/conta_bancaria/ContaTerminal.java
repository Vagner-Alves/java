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
		
		

	}

}
