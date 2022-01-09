package devdojo.maratonajava.javacore.Qstring;

public class StringTeste02 {
	public static void main(String[] args) {
		String nome = "Rafael";
		System.out.println(nome.charAt(2)); //retorna o valor da posição informada
		
		System.out.println(nome.length()); //retorna o tamanho da string
		
		System.out.println(nome.replace("f", "ph")); //substitui os valores do parametro 1 pelo parametro 2
		
		System.out.println(nome.toUpperCase());
		System.out.println(nome.toLowerCase());
		
		String numeros = "0123456789";
		System.out.println(numeros.substring(2)); //extrai uma string começando do indice informado (inclui o valor incicial - inclusivo)
		System.out.println(numeros.substring(2, 5)); //inclui o valor inicial (inclusivo) e exclui o valor final(exclusivo)
	
		String frase = " teste ";
		System.out.println(frase.trim()); //remove espaços antes e depois da string
	}
}
