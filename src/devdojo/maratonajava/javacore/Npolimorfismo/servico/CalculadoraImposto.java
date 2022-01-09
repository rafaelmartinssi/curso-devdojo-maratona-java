package devdojo.maratonajava.javacore.Npolimorfismo.servico;

import devdojo.maratonajava.javacore.Npolimorfismo.domain.Produto;
import devdojo.maratonajava.javacore.Npolimorfismo.domain.Tomate;

public class CalculadoraImposto {
	
	public static void calcularImposto(Produto produto) {
		double imposto = produto.calcularImposto();
		
		System.out.println("Relatório de imposto");
		System.out.println("Produto: " + produto.getNome());
		System.out.println("Valor: " + produto.getValor());
		System.out.println("Imposto: " + imposto);
		
		if(produto instanceof Tomate) {
			//Tomate tomate = (Tomate) produto;
			//System.out.println("Data de Validade: " + tomate.getValidade());
			
			System.out.println("Data de Validade: " + ((Tomate) produto).getValidade());
		}
	}
}
