package aprendendo.estruturas_repeticao;
import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double mesada = 50.0;
		
		while(mesada > 0) {
			double valorDoce = valorAleatorio();
			
			/*if(valorDoce > mesada)
				valorDoce = mesada;
			*/
			System.out.println("Doce do valor: " + valorDoce + " adicionado ao carrinho!");
			mesada -= valorDoce;
		}
		
		System.out.println("Mesada: " + mesada);
		System.out.println("joãozinho gastou tudo com doce! :C");
		
	}
	
	private static double valorAleatorio() {
		return ThreadLocalRandom.current().nextDouble(2,8);
	}

}
