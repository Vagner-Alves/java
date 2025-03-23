package projeto.banco_digital;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		Cliente vagner = new Cliente();
		vagner.setNome("Vagner Alves");
		Conta cc = new ContaCorrente(vagner);
		Conta poupanca = new ContaPoupanca(vagner);
		
		cc.depositar(180);
		cc.transferir(80, poupanca);
		cc.imprimirExtrato();
		//poupanca.imprimirExtrato();
		
		Banco banco = new Banco();
		
		List<Conta> contas = new ArrayList<Conta>();
		contas.add(poupanca);
		contas.add(cc);
		banco.setContas(contas);
		
		banco.imprimirClientes();
	}

}
