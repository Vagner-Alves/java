package aprendendo.estruturas_condicionais;

public class SistemaMedida {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sigla = "G";
		
		switch(sigla) {
		
		case "P":{
			System.out.println("PEQUENO");
			break;
		}
		
		case "M":{
			System.out.println("MAIOR");
			break;
		}
		
		case "G":{
			System.out.println("GRANDE");
			break;
		}
		default:
			System.out.println("INDEFINIDO");
	}

}
	}
