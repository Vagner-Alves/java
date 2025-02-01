package aprendendo.sintaxe;

public class Metodos {
	
	public double somar(int numero1, int numero2) {
		// lógica e finalidade do método abaixo
		// método do tipo double, deve retornar um valor double
		return numero1 + numero2;
	}
	
	public void imprimir(String texto) {
		// método do tipo VOID não precisa retornar dados
	}
	
	// throws Exception: indica que o método ao ser utilizado pode gerar uma excessão
	// no caso divisão por zero.
	public double dividir(int dividendo, int divisor) throws Exception{
		return dividendo / divisor;
	}
	
	// esse método não pode ser visto por outras classes no projeto
	private void metodoPrivado() {}
	
	// EQUIVOCOS
	public void validar() {
		// esse método deveria retornar um valor
		// nesse caso ( boolean) true or false.
	}
	
	public void calcularEnviar() {
		// um método deve representar uma única responsabilidade!
	}
	
	// o método abaixo tem a função de gravar e criar informações de um cliente
	// por que não criar um objeto Cliente e passar como parametro?
	public void gravarCliente(String nome, String cpf, Integer telefone) {
		
	}
	
	// correção
	// passamos 'Cliente cliente' como parametro
	public void gravarCliente() {}
	

}
