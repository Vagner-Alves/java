package aprendendo.tratamentos_excecoes;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class SobreMim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

		System.out.println("informe seu nome: ");
		String nome = scanner.next();

		System.out.println("informe seu sobrenome: ");
		String sobreNome = scanner.next();

		System.out.println("informe sua idade: ");
		int idade = scanner.nextInt();

		System.out.println("informe sua altura: ");
		double altura = scanner.nextDouble();
		
		System.out.println("Olá, Meu Nome é:" + nome + " " + sobreNome);
		System.out.println("minha idade: " + idade);
		System.out.println("altura: " + altura);
		scanner.close();
		
		}
		catch(InputMismatchException e) {
			System.err.println("Os campos idade e altura precisam ser numéricos");
			System.err.println("dica: utiliza . ao invés de vírgula");
		}

		

	}

}
