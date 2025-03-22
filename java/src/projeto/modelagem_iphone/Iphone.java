package projeto.modelagem_iphone;

public class Iphone implements AparelhoTelefonico, ReprodutorMusical, NavegadorInternet{

	@Override
	public void exibirPagina(String url) {
		// TODO Auto-generated method stub
		System.out.println("www." + url + ".com");
	}

	@Override
	public void adicionarNovaAba() {
		// TODO Auto-generated method stub
		System.out.println("nova guia aberta");
	}

	@Override
	public void atualizarPagina() {
		// TODO Auto-generated method stub
		System.out.println("atualizando página");
	}

	@Override
	public void tocar() {
		// TODO Auto-generated method stub
		System.out.println("reproduzindo música");
	}

	@Override
	public void pausar() {
		// TODO Auto-generated method stub
		System.out.println("música pausada");
	}

	@Override
	public void selecionarMusica(String musica) {
		// TODO Auto-generated method stub
		System.out.println("reproduzindo " + musica);
		
	}

	@Override
	public void ligar(String numero) {
		// TODO Auto-generated method stub
		System.out.println("ligando para " + numero);
	}

	@Override
	public void atender() {
		// TODO Auto-generated method stub
		System.out.println("atendendo ligação");
	}

	@Override
	public void iniciarCorreioVoz() {
		// TODO Auto-generated method stub
		System.out.println("Deixe aqui o seu recado");
	}
	
}
