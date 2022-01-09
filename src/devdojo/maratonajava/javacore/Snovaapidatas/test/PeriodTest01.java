package devdojo.maratonajava.javacore.Snovaapidatas.test;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class PeriodTest01 {
	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		LocalDate dateAfterTwoYears = LocalDate.now().plusYears(2);
		
		//Classe Period trabalha com LocalDate, essa classe é um pouco diferente, não entendi muito bem.
		Period p1 = Period.between(dateAfterTwoYears,date);
		System.out.println(p1);
		
		System.out.println(date.until(dateAfterTwoYears, ChronoUnit.DAYS));
	}
}
