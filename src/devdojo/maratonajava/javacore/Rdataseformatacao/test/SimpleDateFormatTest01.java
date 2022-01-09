package devdojo.maratonajava.javacore.Rdataseformatacao.test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class SimpleDateFormatTest01 {
	public static void main(String[] args) {
		String pattern = "yyyy/MM/dd HH:mm:ss";
		//String pattern = "yyyy/MM/dd";
		
		//Mais simples de formatar que o DataFormat
		//não é abstrata, pode ser instanciada
		SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
		
		Calendar calendar = Calendar.getInstance();
		System.out.println(dateFormat.format(calendar.getTime()));
		System.out.println(dateFormat.format(new Date()));
	}
}
