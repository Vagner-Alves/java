package aprendendo.estruturas_repeticao;

public class ExemploFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int carneirinhos =1; carneirinhos <= 20; carneirinhos ++ ) {
			System.out.println(carneirinhos + "º Carneirinho");
		}
		
		System.out.println("-------------------------");
		
		// utilizando FOR com ARRAYS
		// indice em arrays se inicia em zero
		String alunos[] = {"VAGNER","LAVINIA", "ANDRIELLE", "LUCAS"};
		
		for(int x = 0; x < alunos.length; x++) {
			System.out.println("O aluno do índice x= " + x + " é " + alunos[x]);
		}
		
		System.out.println("UTILIZANDO FOR EACH");
		System.out.println(" ");
		for(String aluno: alunos) {
			System.out.println("Nome do Aluno é: " + aluno);
		}

	}

}
