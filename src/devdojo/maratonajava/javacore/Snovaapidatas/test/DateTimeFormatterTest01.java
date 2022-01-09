package devdojo.maratonajava.javacore.Snovaapidatas.test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterTest01 {
	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		
		//utilizando DateTimeFormatter (formatando)
		//quando formata transforma em string
		//convertendo de LocalDate para String
		String d1 = date.format(DateTimeFormatter.BASIC_ISO_DATE);
		String d2 = date.format(DateTimeFormatter.ISO_DATE);
		String d3 = date.format(DateTimeFormatter.ISO_LOCAL_DATE);
		
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		
		//parse faz o processo inverso, transforma de String para objeto (LocalDate)
		LocalDate ld1 = LocalDate.parse(d1, DateTimeFormatter.BASIC_ISO_DATE);
		LocalDate ld2 = LocalDate.parse(d2, DateTimeFormatter.ISO_DATE);
		//pode ser utilizado a String direto, mas o padrão tem de ser o mesmo
		LocalDate ld3 = LocalDate.parse("2021-09-28", DateTimeFormatter.ISO_LOCAL_DATE);
		
		System.out.println(ld1);
		System.out.println(ld2);
		System.out.println(ld3);
		
		//formatação personalizada
		String pattern = "dd/MM/yyyy";
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
		String br = date.format(formatter);
		System.out.println(br);
		
		LocalDate brParse = LocalDate.parse(br, formatter);
		System.out.println(brParse);
	}
}
