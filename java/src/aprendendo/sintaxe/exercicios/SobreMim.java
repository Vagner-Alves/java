package aprendendo.sintaxe.exercicios;

public class SobreMim {

	public static void main(String[] args) {
		
		String nome = args[0];
		String sobreNome = args[1];
		int idade = Integer.valueOf(args[2]);
		double altura = Double.valueOf(args[3]);
		
		System.out.println("Olá, Meu Nome é:" + nome + " " + sobreNome);
		System.out.println("minha idade: " + idade);
		System.out.println("altura: " + altura);
		

	}

}
