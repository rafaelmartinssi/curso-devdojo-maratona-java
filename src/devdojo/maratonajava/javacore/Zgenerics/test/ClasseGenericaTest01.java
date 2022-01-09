package devdojo.maratonajava.javacore.Zgenerics.test;

import java.util.ArrayList;
import java.util.List;

import devdojo.maratonajava.javacore.Zgenerics.domain.Barco;
import devdojo.maratonajava.javacore.Zgenerics.domain.Carro;
import devdojo.maratonajava.javacore.Zgenerics.service.BarcoRentavelService;
import devdojo.maratonajava.javacore.Zgenerics.service.CarroRentavelService;
import devdojo.maratonajava.javacore.Zgenerics.service.RentavelService;

public class ClasseGenericaTest01 {
	public static void main(String[] args) {
		CarroRentavelService carroRentavelService = new CarroRentavelService();
		Carro carro = carroRentavelService.buscarCarroDisponivel();
		System.out.println("Usando carro por um mês...");
		carroRentavelService.retornarCarroAlugado(carro);
		
		System.out.println("---------------------------------------");
		
		BarcoRentavelService barcoRentavelService = new BarcoRentavelService();
		Barco barco = barcoRentavelService.buscarBarcoDisponivel();
		System.out.println("Usando barco por um mês...");
		barcoRentavelService.retornarBarcoAlugado(barco);
		
		System.out.println("------------GENERICS---------------------------");
	
		List<Carro> carrosDisponiveis = new ArrayList<Carro>();
		Carro c1 = new Carro("BMW");
		Carro c2 = new Carro("Jaguar");
		carrosDisponiveis.add(c1);
		carrosDisponiveis.add(c2);
		
		RentavelService<Carro> rentavelServiceC = new RentavelService<>(carrosDisponiveis);
		Carro objetoCarro = rentavelServiceC.buscarObjetoDisponivel();
		System.out.println("Usando objeto por um mês...");
		rentavelServiceC.retornarObjetoAlugado(objetoCarro);
		
		System.out.println("---------------------------------------");
		
		List<Barco> barcosDisponiveis = new ArrayList<Barco>();
		Barco b1 = new Barco("Lancha");
		Barco b2 = new Barco("Iate");
		barcosDisponiveis.add(b1);
		barcosDisponiveis.add(b2);
		
		RentavelService<Barco> rentavelServiceB = new RentavelService<>(barcosDisponiveis);
		Barco objetoBarco = rentavelServiceB.buscarObjetoDisponivel();
		System.out.println("Usando objeto por um mês...");
		rentavelServiceB.retornarObjetoAlugado(objetoBarco);
		
	}
}
