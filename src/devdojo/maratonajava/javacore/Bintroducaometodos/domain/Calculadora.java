package devdojo.maratonajava.javacore.Bintroducaometodos.domain;

public class Calculadora {
	
	public void somaDoisNumeros() {
		System.out.println(10 + 10);
	}
	
	public void subtraiDoisNumeros() {
		System.out.println(20-18);
	}
	
	public void multiplicaDoisNumeros(int num1, int num2) {
		System.out.println(num1 * num2);
	}
	
	public double divideDoisNumeros(double num1, double num2) {
		if(num2 == 0) return 0;
		return num1 / num2;
	}
	
	public void somaArray(int[]numeros) {
		int result = 0;
		for(int num: numeros) {
			result += num;
		}
		System.out.println(result);
	}
	
	//exemplo vargs
	public void somaVarArgs(int ...numeros) {
		int result = 0;
		for(int num: numeros) {
			result += num;
		}
		System.out.println(result);
	}
}
