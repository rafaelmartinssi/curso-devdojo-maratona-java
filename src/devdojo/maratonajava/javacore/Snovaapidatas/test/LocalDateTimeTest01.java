package devdojo.maratonajava.javacore.Snovaapidatas.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeTest01 {
	public static void main(String[] args) {
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println(dateTime);
		
		//aceita o parse de uma string
		LocalDate date = LocalDate.parse("2021-08-08");
		System.out.println(date);
		
		LocalTime time = LocalTime.parse("12:02:10");
		System.out.println(time);
		
		//junção da date e time
		LocalDateTime dateTime2 = date.atTime(time);
		System.out.println(dateTime2);
	}
}
