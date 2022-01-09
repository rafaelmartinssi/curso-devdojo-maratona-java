package devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import devdojo.maratonajava.javacore.Aintroducaoclasses.domain.Estudante;

public class EstudanteTest {
	public static void main(String[] args) {
		Estudante estudante = new Estudante();
		
		estudante.nome = "Rafael";
		estudante.idade = 32;
		estudante.sexo = 'M';
		
		System.out.println("Estudante: " 
		+ estudante.nome +", Idade: "+ 
		estudante.idade +", Sexo: "+ estudante.sexo);	
	}
}
