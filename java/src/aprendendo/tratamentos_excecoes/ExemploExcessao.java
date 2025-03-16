package aprendendo.tratamentos_excecoes;

import java.text.NumberFormat;
import java.text.ParseException;

public class ExemploExcessao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Number valor = NumberFormat.getInstance().parse("a1.18");
			System.out.println(valor);
		} catch (ParseException e) {
			
			e.printStackTrace();
		}
		
	}

}
