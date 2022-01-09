package devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest01 {
	public static void main(String[] args) {
		String regex = "ab";
		String texto = "abaaba";
		
		//quem cria o padr�o a ser encontrado
		Pattern pattern = Pattern.compile(regex);
		//quem faz a busca e combina
		Matcher matcher = pattern.matcher(texto);
		
		System.out.println("texto:   " + texto);
		System.out.println("indice:  0123456789");
		System.out.println("regex: " + regex);
		System.out.println("Posi��es encontradas");
		
		//find encontra os padr�es
		while (matcher.find()) {
			//star retorna o valor do indice do vetor onde come�a a combina��o
			//group tr�s o valor encontrado caso haja
			System.out.print(matcher.start() + " " + matcher.group() + "\n");
		}
	}
}
