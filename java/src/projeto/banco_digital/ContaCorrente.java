package projeto.banco_digital;

public class ContaCorrente extends Conta{

	public ContaCorrente(Cliente cliente) {
		super(cliente);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void imprimirExtrato() {
		// TODO Auto-generated method stub
		System.out.println(" EXTRATO CONTA CORRENTE");
		super.imprimirInfoComuns();
	}
	
	
	
}
