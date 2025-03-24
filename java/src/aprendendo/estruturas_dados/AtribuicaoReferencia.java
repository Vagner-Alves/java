package aprendendo.estruturas_dados;

public class AtribuicaoReferencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int primeiro = 1;
		int segundo = primeiro;
		
		System.out.println("primeiro = " + primeiro + " segundo = " + segundo);
		segundo = 2;
		System.out.println("primeiro = " + primeiro + " segundo = " + segundo);
		

	}

}
