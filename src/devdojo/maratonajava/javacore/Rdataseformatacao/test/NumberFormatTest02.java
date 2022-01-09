package devdojo.maratonajava.javacore.Rdataseformatacao.test;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTest02 {
	public static void main(String[] args) {
		Locale locale = new Locale("pt", "BR");
		
		NumberFormat[] numberFormats = new NumberFormat[4];
		
		numberFormats[0] = NumberFormat.getCurrencyInstance();
		numberFormats[1] = NumberFormat.getCurrencyInstance(locale);

		double valor = 10_000.2136;
		
		String teste = numberFormats[0].format(valor);
		System.out.println(teste);
		System.out.println(numberFormats[1].format(valor));
	}
}
