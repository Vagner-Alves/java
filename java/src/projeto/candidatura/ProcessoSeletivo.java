package projeto.candidatura;

import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {

	public static void main(String[] args) {
		System.out.println("Processo Seletivo: ");

		analisarCandidato(1800.0);
		analisarCandidato(2000.0);
		analisarCandidato(4000.0);

	}
	
	static void selecionarCandidatos() {
		String candidatos [] = {"VAGNER","LAVINIA","LARISSA","JOÃO","BRENO","FERNANDA","JOSIEL","ALINE","EMILY","RAYSSA"};
		int candidatoSelecionado = 0;
		double salarioBase = 2000.0;
		while(candidatoSelecionado < 5) {
			
		}
		
	}
	
	static double valorPretendido() {
		return ThreadLocalRandom.current().nextDouble(1800,2000);
	}

	static void analisarCandidato(double salarioPretendido) {
		double salarioBase = 2000.0;

		if( salarioBase > salarioPretendido) {
			System.out.println("Ligar para o Candidato");
		}

		else if (salarioBase == salarioPretendido) {
			System.out.println("Ligar para o candidato e apresentar contra proposta");
		}

		else {
			System.out.println("Aguardar resultado dos demais candidatos");
		}
	}

}
