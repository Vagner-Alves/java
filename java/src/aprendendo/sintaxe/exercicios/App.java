package aprendendo.sintaxe.exercicios;

public class App {
	public static void main(String [] args) {
		
		SmartTv tv = new SmartTv();
		
		// ligar TV
		tv.ligar();
		
		// mudar canal
		tv.mudarCanal(5);
		
		// aumentar volume
		tv.aumentarVolume();
		tv.aumentarVolume();
		tv.aumentarCanal();
		tv.aumentarVolume();
		System.out.println("Volume: " + tv.volume);

		// diminuir volume
		tv.diminuirVolume();
		System.out.println("volume: " + tv.volume);
		
		// aumentar canal +1
		tv.aumentarCanal();
		System.out.println("Canal: " + tv.canal);
		
		// diminuir canal -1
		tv.diminuirCanal();
		System.out.println("Canal: " + tv.canal);
	}

}

