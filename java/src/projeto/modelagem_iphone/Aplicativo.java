package projeto.modelagem_iphone;

public class Aplicativo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Iphone iphone4s = new Iphone();
		
		// interface de navegador de internet
		iphone4s.adicionarNovaAba();
		iphone4s.exibirPagina("tudocelular");
		iphone4s.atualizarPagina();
		
		// interface de reprodutor de músicas
		iphone4s.selecionarMusica("U2- raised by wolves");
		iphone4s.pausar();
		iphone4s.tocar();
		
		// interface de aparelho telefonico
		iphone4s.ligar("99991-99911");
		iphone4s.atender();
		iphone4s.iniciarCorreioVoz();
	}

}
