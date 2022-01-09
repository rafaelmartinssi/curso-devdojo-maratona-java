package devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.List;

import devdojo.maratonajava.javacore.Ycolecoes.domain.Smartphone;

public class SmartphoneListTest01 {
	public static void main(String[] args) {
		Smartphone s1 = new Smartphone("ABC", "Iphone");
		Smartphone s2 = new Smartphone("JKL", "Samsung");
		Smartphone s3 = new Smartphone("MNO", "Motorola");
		Smartphone s4 = new Smartphone("DEF", "Xaomi");
		
		List<Smartphone> smartphones = new ArrayList<>();
		smartphones.add(0, s1);
		smartphones.add(0, s2);
		smartphones.add(0, s3);
		smartphones.add(0, s4);
		
		for(Smartphone smartphone: smartphones) {
			System.out.println(smartphone);
		}
		
		//contains verifica se o objeto existe na lista, de acordo a comparação que foi definida no equals (neste caso pelo serialNumber)
		Smartphone s5 = new Smartphone("ABC", "Iphone");
		System.out.println(smartphones.contains(s5));
		
		//indexOf paga o valor do indece do objeto dentro da lista
		System.out.println(smartphones.indexOf(s5));
		
		//get traz um objeto dentro da lista de acordo a um indece passado
		System.out.println(smartphones.get(3));
	}
}
