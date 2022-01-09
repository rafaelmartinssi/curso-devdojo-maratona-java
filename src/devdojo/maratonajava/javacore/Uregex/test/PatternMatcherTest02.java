package devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest02 {
	public static void main(String[] args) {
		// \d = tudo que � d�gito
		// \D = tudo que n�o � d�gito
		// \s = tudo que � espa�o em branco \t(tab) \n \f \r
		// \S = tudo que n�o � espa�o em branco
		// \w = a-AZ-Z, d�gitos, _ (b�sicamente excluir todos os caracteres especiais)
		// \W = tudo que o \w n�o pega
		
		// [] range; [a-zA-Z]
		// quantificadores para o renge
		// ? Zero ou uma
		// * zero ou mais 
		// + uma ou mais
		// {n,m} de n at� m
		// ()
		// |  o(v|c)o -> ovo, oco
		// $ -> fim da linha
		
		String regex = "\\W";
		String texto = "@a9e_ d%3k";
		
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
