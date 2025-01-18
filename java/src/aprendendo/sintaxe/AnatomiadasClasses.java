package aprendendo.sintaxe;

public class AnatomiadasClasses {
	public static void main(String[] args) {

		System.out.println("Hello world!");

		String BR = "Brasil";
		double PI = 3.14;
		int NUMERO_DE_ESTADOS_DO_BRASIL = 27;

		String nome = "Vagner";
		String sobreNome = "Alves";

		// podemos guardar um método em uma variável do mesmo nome.
		String nomeCompleto = nomeCompleto (nome, sobreNome);
		System.out.println(nomeCompleto);


	}

	// método nomeCompleto, do tipo String, recebe dois parametros e os concatena com a função concat.
	public static String nomeCompleto (String nome, String sobreNome) {
		return nome.concat(" ").concat(sobreNome);
	}

}
