package aprendendo.sintaxe;

import java.util.Date;

public class Operadores {
	public static void main (String[] args) {
		
		// Operador de atribuição '='
		String nome = "VAGNER";
		int idade   = 28;
		double peso = 72.1;
		char sexo = 'M';
		boolean doadorSangue = false;
		Date dataNascimento = new Date();
		
		// Operadores Aritméticos
		double soma = 4 + 12;
		int subtracao = 5 - 2;
		int multiplicacao = 7 * 2;
		int divisao = 15 / 3;
		int modulo = 18 % 3;
		double expressaoMatematica = ( 10 * 2) + ( 14 / 2);
		
		// Operadores únarios
		
		int numero = 5;
		
		// imprimir número negativo
		System.out.println(- numero);
		
		// inclementando o número em +1
		numero ++;
		System.out.println(numero);
		
		// algo errado...
		System.out.println(numero ++);
		
		// agora irá funcionar
		System.out.println(numero);
		
		// a ordem de precedencia é importante
		System.out.println( ++ numero);
		
		boolean verdadeiro = true;
		
		System.out.println("inverter" + !verdadeiro);
	}

}
