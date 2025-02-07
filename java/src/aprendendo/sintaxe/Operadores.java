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

		// ou
		boolean falso = !verdadeiro;
		System.out.println(falso);

		// Operadores Ternários

		int a, b;
		String resultadoCondicional, resultadoTernario;
		a = 5;
		b = 6;

		// Exemplo condicional utilizando uma estrutura if / else
		if ( a == b)
			resultadoCondicional = "verdadeiro";
		else
			resultadoCondicional = "falso";

		// exemplo usando ternário
		resultadoTernario = (a == b) ? "verdadeiro": "falso";
		System.out.println(resultadoTernario);
		
		resultadoTernario = ( a > b) ? "verdadeiro": "falso";
		System.out.println(resultadoTernario);
		
		resultadoTernario = (a < b) ? "verdadeiro": "falso";
		System.out.println(resultadoTernario);

		// Operadores Relacionais

		int numero1 = 1;
		int numero2 = 2;

		if (numero1 > numero2)
			System.out.println(numero1 + " é maior que " + numero2);

		if (numero1 < numero2)
			System.out.println(numero1 + " é menor que " + numero2);

		if (numero1 >= numero2)
			System.out.println(numero1 + " é maior ou igual a " + numero2);

		if(numero1 <= numero2)
			System.out.println(numero1 + " é menor ou igual a " + numero2);

		if (numero1 != numero2)
			System.out.println(numero1 + " é diferente de " + numero2);

		// COMPARAÇÕESA AVANÇADAS
		
		String nome1 = "Java";
		String nome2 = "Java";
				
		System.out.println(nome1 == nome2); // TRUE
		
		String nome3 = new String("JAVA");
		
		System.out.println(nome1 == nome3); // FALSE
		
		String nome4 = nome3;
		
		// EQUALS
		System.out.println(nome1.equals(nome2));
		System.out.println(nome2.equals(nome3));
		System.out.println(nome3.equals(nome4));
		
		int primeiroNumero = 130;
		int segundoNumero  = 130;
		
		System.out.println(primeiroNumero == segundoNumero); // TRUE
		
		Integer terceiroNumero = 130;
		Integer quartoNumero  = 130;
		
		System.out.println(terceiroNumero == quartoNumero); //FALSE
		
		// O RESULTADO SERÁ FALSE, POIS O JAVA TRATA OS VALORES COMO OBJETOS A PARTI DE AGORA.
		// QUANDO QUEREMOS COMPARAR OBJETOS, USAMOS O MÉTODO equals
		
		System.out.println(terceiroNumero.equals(quartoNumero));
		
		// LÓGICOS
		
		boolean condicao1 = true;
		boolean condicao2 = false;
		
		if(condicao1 && condicao2)
			System.out.println("Os dois valores precisam ser verdadeiros: ");
		
		if ( condicao1 && ( 7 > 4 ))
			System.out.println("Os dois valores precisam ser verdadeiros:");
		
		if(condicao1 || condicao2)
			System.out.println("Um dos valores precisa ser verdadeiro: ");
		
		
		
		// EXPRESSÕES LÓGICAS AVANÇADAS
		
		int quintoNumero = 1;
		int sextoNumero = 1;
		
		if(quintoNumero == 2 & sextoNumero ++ == 2)
			System.out.println("As 2 condições são verdadeiras");
		
		System.out.println("O número 1 agora é: " + quintoNumero);
		System.out.println("O número 2 agora é: " + sextoNumero);
		
		
		
		
	}

}
