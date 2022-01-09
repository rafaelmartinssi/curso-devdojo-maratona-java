package devdojo.maratonajava.javacore.Snovaapidatas.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class ChronoUnitTest01 {
	public static void main(String[] args) {
		LocalDate dateBirthday = LocalDate.of(1988, 11, 27);
		LocalDate dataNow = LocalDate.now();
		//ChronoUnit boa de trabalhar para compara datas, e tempo em geral
		//Para compara tempo (horas é melhor a Duration)
		System.out.println(ChronoUnit.YEARS.between(dateBirthday, dataNow));
		
		
		LocalDateTime now = LocalDateTime.now();
		LocalDateTime nowAfterTwoYers = LocalDateTime.now().plusYears(2);
		
		LocalTime timeNow = LocalTime.now();
		LocalTime timePlus7hours = LocalTime.now().plusHours(7);
		
		//retorna um long
		Long rsult = ChronoUnit.DAYS.between(now, nowAfterTwoYers);
		System.out.println(rsult);
		System.out.println(ChronoUnit.HOURS.between(timePlus7hours, timeNow));
	}
}
