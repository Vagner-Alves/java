package aprendendo.tratamentos_excecoes;

public class FormatadorCepExemplo {

	public static void main(String[] args) {
		
		try {
			String meuCepFormatado = formatarCep("23765064");
			System.out.println(meuCepFormatado);
		} catch (CepInvalidoException e) {
			
			e.printStackTrace();
			System.out.println("O cep não corresponde com as regras de negócio. ");
		}
		
	}
	
	static String formatarCep(String cep) throws CepInvalidoException{
		if(cep.length() != 8)
			throw new CepInvalidoException();
		
			return "xx.xxx.xxx-xx";
	}

}
