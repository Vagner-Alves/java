package aprendendo.estruturas_repeticao;

import java.util.Random;

public class ExemploDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		do {
			System.out.println("telefone tocando...");
		}
		while(tocando());
		
		System.out.println("Olá! quem fala?");

	}
	private static boolean tocando() {
		boolean atendeu = new Random().nextInt(3) ==1;
		System.out.println("atendeu ? " + atendeu);
		
		return !atendeu;
	}

}
