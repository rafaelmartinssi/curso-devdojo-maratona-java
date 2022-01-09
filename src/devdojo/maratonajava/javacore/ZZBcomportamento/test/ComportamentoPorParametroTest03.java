package devdojo.maratonajava.javacore.ZZBcomportamento.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import devdojo.maratonajava.javacore.ZZBcomportamento.domain.Car;

public class ComportamentoPorParametroTest03 {

	public static List<Car> cars = new ArrayList<>();
	
	public static void main(String[] args) {
		cars.add(new Car("Audi", "RED", 2000));
		cars.add(new Car("Mercedes", "BLUE", 2005));
		cars.add(new Car("Ford", "BLACK", 2010));
		cars.add(new Car("Fiat", "WHITE", 2015));
		
		System.out.println(filterByPredicate(cars, car -> car.getAno() > 2009));
		System.out.println("----------------------");
		System.out.println(filterByPredicate(cars, car -> car.getCor().equals("BLUE")));

	}
	
	//Deixando o método o mais genérico possível.
	public static <T> List<T> filterByPredicate(List<T> list, Predicate<T> predicate) {
		List<T> result = new ArrayList<>();
		for(T t : list) {
			if(predicate.test(t)) {
				result.add(t);
			}
		}
		return result;
	}
	
}
