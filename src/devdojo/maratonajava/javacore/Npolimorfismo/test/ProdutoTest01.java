package devdojo.maratonajava.javacore.Npolimorfismo.test;

import devdojo.maratonajava.javacore.Npolimorfismo.domain.Computador;
import devdojo.maratonajava.javacore.Npolimorfismo.domain.Tomate;
import devdojo.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {
	public static void main(String[] args) {
		Computador computador = new Computador("Dell", 2000);
		CalculadoraImposto.calcularImposto(computador);
		
		System.out.println("--------------------------");
		
		Tomate tomate = new Tomate("Tomate Cereja", 10, "14/09/2021");
		CalculadoraImposto.calcularImposto(tomate);
	}
}
