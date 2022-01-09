package devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
	public static void main (String[]args) {
		
		//int, double, float, char, byte, short, long, boolean
		
		int idade = 10;
		long numeroGrande = 1000000L;
		double salarioDouble = 2000.0D;
		float salarioFloat = 2000.0F;
		byte idadeByte = 10;
		short idadeShort = 10;
		boolean ativo = true; //or false
		char caractere = 'M'; //aceita apenas um caractere entre aspas simples
		
		String nome = "Rafael";
		
		System.out.println(idade);
		System.out.println(numeroGrande);
		System.out.println(salarioDouble);
		System.out.println(salarioFloat);
		System.out.println(idadeByte);
		System.out.println(idadeShort);
		System.out.println(ativo);
		System.out.println(caractere);
		System.out.println(nome);
		String teste = String.format("%d, %g", numeroGrande, salarioDouble);
		System.out.println(teste);
		
	}
}
