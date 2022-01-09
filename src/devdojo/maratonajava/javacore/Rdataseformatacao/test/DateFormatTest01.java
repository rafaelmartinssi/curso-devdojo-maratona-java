package devdojo.maratonajava.javacore.Rdataseformatacao.test;

import java.text.DateFormat;
import java.util.Calendar;

public class DateFormatTest01 {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		
		//DateFormat não pode ser instanciado, classe abstrata
		//é um formatador de datas
		DateFormat [] formats = new DateFormat[7];
		formats[0] = DateFormat.getInstance();
		formats[1] = DateFormat.getDateInstance();
		formats[2] = DateFormat.getDateTimeInstance();
		formats[3] = DateFormat.getDateInstance(DateFormat.SHORT);
		formats[4] = DateFormat.getDateInstance(DateFormat.MEDIUM);
		formats[5] = DateFormat.getDateInstance(DateFormat.LONG);
		formats[6] = DateFormat.getDateInstance(DateFormat.FULL);
		
		for(DateFormat format: formats) {
			System.out.println(format.format(calendar.getTime()));
		}
		
		DateFormat dateFormat = DateFormat.getDateInstance();
		System.out.println(dateFormat.format(calendar.getTime()));
		
		String teste = dateFormat.format(calendar.getTime());
		System.out.println(teste);
		
	}
}
