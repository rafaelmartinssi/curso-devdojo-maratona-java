package devdojo.maratonajava.javacore.Snovaapidatas.test;

import java.time.LocalDate;

public class LocalDateTest01 {
	public static void main(String[] args) {
		//Formas antigas
		//Date dateAntigo = new Date();
		//Calendar calendar = Calendar.getInstance();
		
		//Nova API, introduzida na vers�o 8
		//LocalDate n�o � uma classe abstrata, mas seu construtor � privado, ou seja n�o pode ser utilizado o new 
		//LocalDate date = LocalDate.of(2021, Month.SEPTEMBER, 23);
		
		LocalDate date = LocalDate.now();
		System.out.println(date);
		
		System.out.println(date.getYear());
		System.out.println(date.getMonth());
		System.out.println(date.getMonthValue());
		System.out.println(date.getDayOfWeek());
		System.out.println(date.getDayOfMonth());
		System.out.println(date.lengthOfMonth());
		System.out.println(date.isLeapYear()); //se � bissesto
	}
}
