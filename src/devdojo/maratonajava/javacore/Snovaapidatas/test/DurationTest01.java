package devdojo.maratonajava.javacore.Snovaapidatas.test;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DurationTest01 {
	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		LocalDateTime nowAfterTwoYers = LocalDateTime.now().plusYears(2);
		
		LocalTime timeNow = LocalTime.now();
		LocalTime timeMinus7hours = LocalTime.now().minusHours(7);
		
		//classe duration trabalha com segundos
		//Classe LocalDate não trabalha com essa classe
		Duration d1 = Duration.between(now, nowAfterTwoYers);
		System.out.println(d1);
		
		Duration d2 = Duration.between(timeNow, timeMinus7hours);
		System.out.println(d2);
	}
}
