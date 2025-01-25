package aprendendo.sintaxe.exercicios;

public class SmartTv {
	boolean ligada = true;
	int canal = 1;
	int volume = 0;

	public void ligar() {
		ligada = (ligada == true) ? false: true;
		System.out.println(ligada);

	}

	public void aumentarVolume() {
		volume ++;
	}

	public void diminuirVolume() {
		volume --;
	}

	public void mudarCanal (int numeroCanal) {
		canal = numeroCanal;
	}
	
	public void aumentarCanal() {
		canal ++;
	}
	
	public void diminuirCanal() {
		canal --;
	}

}
