package projeto.banco_digital;

public class Main {

	public static void main(String[] args) {
		
		Cliente vagner = new Cliente();
		vagner.setNome("Vagner Alves");
		Conta cc = new ContaCorrente(vagner);
		Conta poupanca = new ContaPoupanca(vagner);
		
		cc.depositar(180);
		cc.transferir(80, poupanca);
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
