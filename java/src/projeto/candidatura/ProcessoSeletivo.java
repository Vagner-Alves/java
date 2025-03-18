package projeto.candidatura;

public class ProcessoSeletivo {

	public static void main(String[] args) {
		System.out.println("Processo Seletivo: ");
		
		analisarCandidato(1800);
		analisarCandidato(2000);
		analisarCandidato(4000);

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
