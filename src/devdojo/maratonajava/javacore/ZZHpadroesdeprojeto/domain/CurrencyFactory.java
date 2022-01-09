package devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.domain;

public class CurrencyFactory{

	public static Currency newCurrency(Country country) {
		switch (country) {
		case BRASIL:
			return new Real();
		case USA:
			return new UsDollar(); 
		default:
			throw new IllegalArgumentException("No currency found");
		}
	}
	
}
