package devdojo.maratonajava.javacore.Snovaapidatas.test;

import java.time.LocalDate;

public class LocalDateTest01 {
	public static void main(String[] args) {
		//Formas antigas
		//Date dateAntigo = new Date();
		//Calendar calendar = Calendar.getInstance();
		
		//Nova API, introduzida na versão 8
		//LocalDate não é uma classe abstrata, mas seu construtor é privado, ou seja não pode ser utilizado o new 
		//LocalDate date = LocalDate.of(2021, Month.SEPTEMBER, 23);
		
		LocalDate date = LocalDate.now();
		System.out.println(date);
		
		System.out.println(date.getYear());
		System.out.println(date.getMonth());
		System.out.println(date.getMonthValue());
		System.out.println(date.getDayOfWeek());
		System.out.println(date.getDayOfMonth());
		System.out.println(date.lengthOfMonth());
		System.out.println(date.isLeapYear()); //se é bissesto
	}
}
