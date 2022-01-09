package devdojo.maratonajava.javacore.Zgenerics.service;

import java.util.List;

//a introdu��o de <T> logo apos o nome da classe indica que se quer trabalhar com generics
//substitui por T todas as partes do c�digo que tenha o nome da classe que se deseja trabalhar 
public class RentavelService<T> {

	private List<T> objetosDisponiveis;
	
	public RentavelService(List<T> objetosDisponiveis){
		this.objetosDisponiveis = objetosDisponiveis;
	}
	
	public T buscarObjetoDisponivel() {
		System.out.println("Buscando objeto dispon�vel...");
		T objeto = objetosDisponiveis.remove(0);
		System.out.println("Alugando objeto: " + objeto);
		System.out.println("Objetos dispon�veis para alugar: ");
		System.out.println(objetosDisponiveis);
		return objeto;
	}
	
	public void retornarObjetoAlugado(T objeto) {
		System.out.println("Devolvendo objeto: " + objeto);
		objetosDisponiveis.add(objeto);
		System.out.println("Objetos dispon�veis para alugar: ");
		System.out.println(objetosDisponiveis);
	}
}
