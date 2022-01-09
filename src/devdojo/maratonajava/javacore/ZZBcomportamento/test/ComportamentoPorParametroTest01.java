package devdojo.maratonajava.javacore.ZZBcomportamento.test;

import java.util.ArrayList;
import java.util.List;

import devdojo.maratonajava.javacore.ZZBcomportamento.domain.Car;

public class ComportamentoPorParametroTest01 {

	public static List<Car> cars = new ArrayList<>();
	
	public static void main(String[] args) {
		cars.add(new Car("Audi", "RED", 2000));
		cars.add(new Car("Mercedes", "BLUE", 2005));
		cars.add(new Car("Ford", "BLACK", 2010));
		cars.add(new Car("Fiat", "WHITE", 2015));
		
		System.out.println(filterByColor(cars, "BLUE"));
		System.out.println("-----------------------------------");
		System.out.println(filterByAno(cars, 2009));
	}
	
	public static List<Car> filterByColor(List<Car> cars, String color) {
		List<Car> result = new ArrayList<>();
		for(Car car : cars) {
			if(car.getCor().equals(color)) {
				result.add(car);
			}
		}
		return result;
	}
	
	public static List<Car> filterByAno(List<Car> cars, int ano) {
		List<Car> result = new ArrayList<>();
		for(Car car : cars) {
			if(car.getAno() > ano) {
				result.add(car);
			}
		}
		return result;
	}
}
