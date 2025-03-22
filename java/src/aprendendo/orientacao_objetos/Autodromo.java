package aprendendo.orientacao_objetos;

public class Autodromo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Carro jeep = new Carro();
		Moto motocicleta = new Moto();
		jeep.ligar();
		
		motocicleta.setChassi("810081");
		System.out.println(motocicleta.getChassi());
		
	}

}
