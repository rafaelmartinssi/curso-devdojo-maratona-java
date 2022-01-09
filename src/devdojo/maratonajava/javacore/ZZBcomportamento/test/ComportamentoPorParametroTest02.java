package devdojo.maratonajava.javacore.ZZBcomportamento.test;

import java.util.ArrayList;
import java.util.List;

import devdojo.maratonajava.javacore.ZZBcomportamento.domain.Car;
import devdojo.maratonajava.javacore.ZZBcomportamento.interfaces.CarPredicate;

public class ComportamentoPorParametroTest02 {

	public static List<Car> cars = new ArrayList<>();
	
	public static void main(String[] args) {
		cars.add(new Car("Audi", "RED", 2000));
		cars.add(new Car("Mercedes", "BLUE", 2005));
		cars.add(new Car("Ford", "BLACK", 2010));
		cars.add(new Car("Fiat", "WHITE", 2015));
		
		System.out.println(filterByPredicate(cars, new CarPredicate() {
			@Override
			public boolean test(Car car) {
				return car.getCor().equals("BLUE");
			}
		}));
		
		System.out.println(filterByPredicate(cars, new CarPredicate() {
			@Override
			public boolean test(Car car) {
				return car.getAno() > 2009;
			}
		}));
		
		//só posso usar lambda quando a interface tiver apenas um método
		System.out.println(filterByPredicate(cars, car -> car.getCor().equals("BLUE")));
		
		System.out.println(filterByPredicate(cars, car -> car.getAno() > 2009));

	}
	
	public static List<Car> filterByPredicate(List<Car> cars, CarPredicate predicate) {
		List<Car> result = new ArrayList<>();
		for(Car car : cars) {
			if(predicate.test(car)) {
				result.add(car);
			}
		}
		return result;
	}
	
}
