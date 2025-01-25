package aprendendo.sintaxe.exercicios;

public class SmartTv {
	boolean ligada = false;
	int canal = 1;
	int volume = 0;
	
	// liga ou desliga a tv
	public void ligar() {
		ligada = (ligada == true) ? false: true;
		System.out.println("TV Ligada :" + ligada);
		
	}

	public void aumentarVolume() {
		volume ++;
	}

	public void diminuirVolume() {
		volume --;
	}

	public void mudarCanal (int numeroCanal) {
		canal = numeroCanal;
		System.out.println("Mudando para Canal: " + canal);
	}
	
	public void aumentarCanal() {
		canal ++;
	}
	
	public void diminuirCanal() {
		canal --;
	}

}
