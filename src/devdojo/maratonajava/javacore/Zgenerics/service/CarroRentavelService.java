package devdojo.maratonajava.javacore.Zgenerics.service;

import java.util.ArrayList;
import java.util.List;

import devdojo.maratonajava.javacore.Zgenerics.domain.Carro;

public class CarroRentavelService {
	Carro c1 = new Carro("BMW");
	Carro c2 = new Carro("Jaguar");
	private List<Carro> carrosDisponiveis = new ArrayList<Carro>();
	
	{
		carrosDisponiveis.add(c1);
		carrosDisponiveis.add(c2);
	}
	
	public Carro buscarCarroDisponivel() {
		System.out.println("Buscando carro disponível...");
		Carro carro = carrosDisponiveis.remove(0);
		System.out.println("Alugando carro: " + carro);
		System.out.println("Carros disponíveis para alugar: ");
		System.out.println(carrosDisponiveis);
		return carro;
	}
	
	public void retornarCarroAlugado(Carro carro) {
		System.out.println("Devolvendo carro: " + carro);
		carrosDisponiveis.add(carro);
		System.out.println("Carros disponíveis para alugar: ");
		System.out.println(carrosDisponiveis);
	}
}
