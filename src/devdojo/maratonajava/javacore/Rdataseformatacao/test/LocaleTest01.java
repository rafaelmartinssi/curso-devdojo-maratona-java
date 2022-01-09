package devdojo.maratonajava.javacore.Rdataseformatacao.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest01 {
	public static void main(String[] args) {
		//para formatação de datas, números e moeda (internacionalização)
		//não é uma classe abstrata, pode ser instanciada
		Locale locale = new Locale("pt", "BR");
		
		Calendar calendar = Calendar.getInstance();
		
		DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.FULL, locale);
		
		String data = dateFormat.format(calendar.getTime());
		
		System.out.println(data);
	}
}
