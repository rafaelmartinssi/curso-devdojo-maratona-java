package devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.test;

import devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.domain.Aircraft;

public class SingletonTest01 {
	public static void main(String[] args) {
		bookSeat("A1");
		bookSeat("A1");
	}
	
	public static void bookSeat(String seat) {
		Aircraft aircraft = Aircraft.getINSTANCE();
		System.out.println(aircraft.bookSeat(seat));
	}
}
