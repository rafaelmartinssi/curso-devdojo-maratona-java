package devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.test;

import devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.domain.Person;

public class BuilderPatternTest01 {
	public static void main(String[] args) {
		Person person = new Person.Builder()
			.firstName("Rafael")
			.lastName("Martins")
			.username("rafa")
			.email("rafa@gmail.com")
			.build();
		
		System.out.println(person);
	}
}
