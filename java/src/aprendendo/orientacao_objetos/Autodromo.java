package aprendendo.orientacao_objetos;

public class Autodromo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Carro jeep = new Carro();
		
		jeep.ligar();
		
		Moto z400 = new Moto();
		z400.setChassi("810081");
		System.out.println(z400.getChassi());
		z400.ligar();
		
		Veiculo coringa = jeep;
		
		coringa.ligar();
		
	}

}
