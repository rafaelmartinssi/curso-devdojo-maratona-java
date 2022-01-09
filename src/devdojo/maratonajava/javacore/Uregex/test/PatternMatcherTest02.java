package devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest02 {
	public static void main(String[] args) {
		// \d = tudo que é dígito
		// \D = tudo que não é dígito
		// \s = tudo que é espaço em branco \t(tab) \n \f \r
		// \S = tudo que não é espaço em branco
		// \w = a-AZ-Z, dígitos, _ (básicamente excluir todos os caracteres especiais)
		// \W = tudo que o \w não pega
		
		// [] range; [a-zA-Z]
		// quantificadores para o renge
		// ? Zero ou uma
		// * zero ou mais 
		// + uma ou mais
		// {n,m} de n até m
		// ()
		// |  o(v|c)o -> ovo, oco
		// $ -> fim da linha
		
		String regex = "\\W";
		String texto = "@a9e_ d%3k";
		
		//quem cria o padrão a ser encontrado
		Pattern pattern = Pattern.compile(regex);
		//quem faz a busca e combina
		Matcher matcher = pattern.matcher(texto);
		
		System.out.println("texto:   " + texto);
		System.out.println("indice:  0123456789");
		System.out.println("regex: " + regex);
		System.out.println("Posições encontradas");
		
		//find encontra os padrões
		while (matcher.find()) {
			//star retorna o valor do indice do vetor onde começa a combinação
			//group trás o valor encontrado caso haja
			System.out.print(matcher.start() + " " + matcher.group() + "\n");
		}
	}
}
