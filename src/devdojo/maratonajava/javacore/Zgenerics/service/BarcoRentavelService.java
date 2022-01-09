package devdojo.maratonajava.javacore.Zgenerics.service;

import java.util.ArrayList;
import java.util.List;

import devdojo.maratonajava.javacore.Zgenerics.domain.Barco;

public class BarcoRentavelService {
	Barco b1 = new Barco("Lancha");
	Barco b2 = new Barco("Iate");
	private List<Barco> barcosDisponiveis = new ArrayList<Barco>();
	
	{
		barcosDisponiveis.add(b1);
		barcosDisponiveis.add(b2);
	}
	
	public Barco buscarBarcoDisponivel() {
		System.out.println("Buscando barco disponível...");
		Barco barco = barcosDisponiveis.remove(0);
		System.out.println("Alugando barco: " + barco);
		System.out.println("Barcos disponíveis para alugar: ");
		System.out.println(barcosDisponiveis);
		return barco;
	}
	
	public void retornarBarcoAlugado(Barco barco) {
		System.out.println("Devolvendo barco: " + barco);
		barcosDisponiveis.add(barco);
		System.out.println("Barcos disponíveis para alugar: ");
		System.out.println(barcosDisponiveis);
	}
}
