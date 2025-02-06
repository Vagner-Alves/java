package aprendendo.sintaxe.exercicios;

/** 
 *  <h1> Calculadora </h1>
 *  A Calculadora realiza operações matemáticas entre números inteiros
 *  <p>
 *  <b> Nota:</b> Leia atentamente a documentação desta classes para aproveitar os recursos oferecidos
 *  pelo autor da classe
 *  
 *  @author Vagner Alves
 *  @version 1.0
 *  @since 06/02/2025
 *  
 *  
 * */

public class Calculadora {
	/** 
	 * esté método pe utilizado para somar, subtrair , dividir e multiplicar dois números
	 * @param primeiroNumero: o primeiro parametro de um método
	 * @param segundoNumero: o segundo parametro de um método
	 * @return retorna o valor do calculo
	 * 
	 * */
	
	public int somar(int primeiroNumero, int segundoNumero) {
		return primeiroNumero + segundoNumero;
	}
	
	/** 
	 * esté método pe utilizado para subtrair dois números
	 * @param primeiroNumero: o primeiro parametro de um método
	 * @param segundoNumero: o segundo parametro de um método
	 * @return retorna o valor do calculo
	 * 
	 * */
	
	
	public int subtrair ( int primeiroNumero, int segundoNumero) {
		return primeiroNumero - segundoNumero;
	}
	
	public int multiplicar ( int primeiroNumero, int segundoNumero) {
		return primeiroNumero - segundoNumero;
	}
	
	public int dividir ( int primeiroNumero, int segundoNumero) {
		return primeiroNumero / segundoNumero;
	}

}
