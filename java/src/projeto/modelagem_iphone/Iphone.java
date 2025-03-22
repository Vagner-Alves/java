package projeto.modelagem_iphone;

public class Iphone implements AparelhoTelefonico, ReprodutorMusical, NavegadorInternet{

	@Override
	public void exibirPagina(String url) {
		// TODO Auto-generated method stub
		System.out.println("www." + url + ".com");
	}

	@Override
	public void adicionar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void atualizarPagina() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void tocar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pausar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void selecionarMusica() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ligar(String numero) {
		// TODO Auto-generated method stub
		System.out.println("ligando para " + numero);
	}

	@Override
	public void atender() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void iniciarCorreioVoz() {
		// TODO Auto-generated method stub
		
	}
	
}
