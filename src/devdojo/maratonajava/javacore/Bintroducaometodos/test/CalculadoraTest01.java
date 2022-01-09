package devdojo.maratonajava.javacore.Bintroducaometodos.test;

import devdojo.maratonajava.javacore.Bintroducaometodos.domain.Calculadora;

public class CalculadoraTest01 {
	public static void main(String[] args) {
		Calculadora calculadora = new Calculadora();
		
		calculadora.somaDoisNumeros();
		calculadora.subtraiDoisNumeros();
		
		calculadora.multiplicaDoisNumeros(50, 2);
		
		System.out.println(calculadora.divideDoisNumeros(20, 0));
		
		int [] numeros = {10,20,50,20};
		calculadora.somaArray(numeros);
		
		calculadora.somaVarArgs(10,20,50,20,100);
		
	}
}
