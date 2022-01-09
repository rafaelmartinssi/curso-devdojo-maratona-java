package devdojo.maratonajava.javacore.Gassociacao.test;

import java.util.Scanner;

public class LeituraDoTecladoTest01 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		String nome = entrada.nextLine();
		System.out.println("Digite sua idade: ");
		int idade = entrada.nextInt();
		System.out.println("Digite o seu sexo (M ou F): ");
		char sexo = entrada.next().charAt(0);
		
		
		System.out.println(">>>>>> Relatório <<<<<<<");
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Sexo: " + sexo);
		
		entrada.close();
		
	}
}
