package devdojo.maratonajava.javacore.ZZAclassesinternas;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import devdojo.maratonajava.javacore.Zgenerics.domain.Barco;

//classe criada para fazer ordena��o de objetos por algum par�metro
//Neste casso pelo nome
class BarcoComparatorName implements Comparator<Barco>{
	@Override
	public int compare(Barco arg0, Barco arg1) {
		return arg0.getNome().compareTo(arg1.getNome());
	}	
}

public class AnonymousClassesTest02 {
	
	public static void main(String[] args) {
		Barco b = new Barco("Navio");
		Barco b1 = new Barco("Lancha");
		Barco b2 = new Barco("Iate");
		List<Barco> barcos = new ArrayList<>();
		barcos.add(b);
		barcos.add(b1);
		barcos.add(b2);
		
		//barcos.sort(new BarcoComparatorName());
		
		//Eu n�o posso dar new em interfaces, a n�o ser que esteja trabalhando com classes an�nimas como neste caso abaixo
		//O que estou fazendo na verdade � criado uma nova classe que implements a interface, ou seja estou implementando a interface
		//Utilizando classe Anonima substitui todo c�digo anterior
		barcos.sort(new Comparator<Barco>() {
			@Override
			public int compare(Barco arg0, Barco arg1) {
				return arg0.getNome().compareTo(arg1.getNome());
			}	
		});
		
		//fazendo com lambdas
		//barcos.sort((o1,o2) -> o1.getNome().compareTo(o2.getNome()));
		
		System.out.println(barcos);
	}
}
