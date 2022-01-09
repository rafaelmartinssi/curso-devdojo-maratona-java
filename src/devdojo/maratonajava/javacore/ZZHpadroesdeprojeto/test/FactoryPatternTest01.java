package devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.test;

import devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.domain.Country;
import devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.domain.Currency;
import devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.domain.CurrencyFactory;

public class FactoryPatternTest01 {
	public static void main(String[] args) {
		
		Currency currency = CurrencyFactory.newCurrency(Country.BRASIL);
		System.out.println(currency.getSymbol());
	}
}
