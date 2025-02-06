package aprendendo.estruturas_condicionais;

public class CaixaEletronico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double saldo = 1880;
		double saque = 400;
		
		if(saque < saldo) {
			saldo -= saque;
			
		}
		
		System.out.println("saldo da sua conta: " + saldo);

	}

}
