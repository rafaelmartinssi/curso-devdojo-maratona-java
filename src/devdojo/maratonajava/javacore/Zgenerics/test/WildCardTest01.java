package devdojo.maratonajava.javacore.Zgenerics.test;

import java.util.ArrayList;
import java.util.List;

class Animal {
	public void consulta() {
		System.out.println("Consultando animal");
	}
}

class Gato extends Animal {
	@Override
	public void consulta() {
		System.out.println("Consultando chumbiricat");
	}
	
	public void outro() {
		System.out.println("teste");
	}
}

class Cachorro extends Animal {
	@Override
	public void consulta() {
		System.out.println("Consultando chumbiridog");
	}	
}

public class WildCardTest01 {
	public static void main(String[] args) {
		Cachorro c1 = new Cachorro();
		Cachorro c2 = new Cachorro();
		Gato g1 = new Gato();
		Gato g2 = new Gato();
		Animal a1 = new Animal();
		Animal a2 = new Animal();
		
		//-------------------------------------------------------
		
		List<Cachorro> cachorros = new ArrayList<Cachorro>();
		cachorros.add(c1);
		cachorros.add(c2);
		
		List<Gato> gatos = new ArrayList<Gato>();
		gatos.add(g1);
		gatos.add(g2);
		
		printConsulta(cachorros);
		printConsulta(gatos);
		
		List<Animal> animals = new ArrayList<Animal>();
		animals.add(a1);
		animals.add(a2);
		
		printConsultaAnimal(animals);
		
	}
	
	//extends pode receber qualquer List<> de Animal ou classe filha de Animal
	//extends permite apenas leitura dos objetos
	/*como não pode evitar receber por exemplo uma List<> 
	* de objetos de Gato e tentar adicionar objetos na lista 
	* de Cachorro, o extends não permite adicionar objetos na lista
	*/
	private static void printConsulta(List<? extends Animal> animals) {
		for(Animal animal: animals) {
			animal.consulta();
		}
		
		//pegando metodos e atributos particulares de cada tipo de objeto
		for(Animal animal: animals) {
			animal.consulta();
			if(animal instanceof Gato) {
				Gato gato = (Gato) animal;
				gato.outro();
			}
		}
	}
	
	//super pode receber qualquer List<> de Animal ou classes acima, por exemplo object neste caso
	//super permite adicionar objetos que passem no teste é um Animal
	/*como ela pode garantir que qualquer List<> passado vai ser um Animal
	 * ela permite que objetos sejam adicionados a lista
	 */
	private static void printConsultaAnimal(List<? super Animal> animals) {
		//passa no teste é um Animal por causa da herança
		animals.add(new Cachorro());
		//passa no teste é um Animal por causa da herança
		animals.add(new Gato());
		
		//para ler existe um problema
		//Não posso colocar Animal por que pode ser uma classe maior
		for(Object object: animals) {
			if(object instanceof Animal) {
				Animal animal = (Animal) object;
				animal.consulta();
			}
		}
	}
}
