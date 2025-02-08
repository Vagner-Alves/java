package aprendendo.estruturas_condicionais;

public class ResultadoEscolar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nota = 7;
		
		// se temos mais de uma instrução dentro do IF / ElSE devemos criar um bloco
		if( nota >= 7) {
			System.out.println("Aluno, Aprovado!");
			System.out.println("Parabéns!!!");
		}
		
		else if (nota >=5 && nota < 7)
			System.out.println("Prova de Recuperação!");
		
		else
			System.out.println("Aluno, Reprovado!");
		
		// USANDO CONDICIONAL TERNARIA
		String resultado = nota >= 7 ? "Aluno, Aprovado!": "Aluno, Reprovado";
		System.out.println(resultado);

	}

}
