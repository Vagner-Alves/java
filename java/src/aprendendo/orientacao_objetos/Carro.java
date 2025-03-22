package aprendendo.orientacao_objetos;

public class Carro {
	
	public void ligar() {
		conferirCambio();
		conferirCombustivel();
		System.out.println("Carro ligado.");
	}
	
	private void conferirCombustivel() {
		System.out.println("conferindo combustivel do veiculo");
	}
	
	private void conferirCambio() {
		System.out.println("Conferindo o cambio");
	}

}
