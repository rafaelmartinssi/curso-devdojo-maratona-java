package devdojo.maratonajava.javacore.Rdataseformatacao.test;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest01 {
	public static void main(String[] args) {
		
		//Calendar é uma classe abstract, não pode ser instanciada
		//tem várias implementações
		Calendar c = Calendar.getInstance();
		//precisa de um formatador
		System.out.println(c);
		
		c.add(Calendar.HOUR, 1);
		
		Date date = c.getTime();
		System.out.println(date);
		
		System.out.println(c.get(Calendar.DAY_OF_MONTH));
		System.out.println(c.get(Calendar.DAY_OF_WEEK));
		System.out.println(c.get(Calendar.DAY_OF_YEAR));
		
	}
}
