package devdojo.maratonajava.javacore.Snovaapidatas.test;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalTimeTest01 {
	public static void main(String[] args) {
		LocalTime localTime = LocalTime.of(23, 23, 23);
		System.out.println(localTime);
		
		String pattern = "HH:mm:ss";
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
		LocalTime time = LocalTime.now();
		System.out.println(time.format(formatter));
		
	}
}
