package devdojo.maratonajava.introducao;

public class Aula04Operadores {
	public static void main(String[] args) {
		
		// + - / *
		int numero1 = 10;
		int numero2 = 20;
		
		double resultado = numero1/numero2; //0.0
		
		double resultado1 = (double)numero1/numero2; //0.5
		
		System.out.println("Valor "+resultado);
		System.out.println("Valor "+resultado1);
		
		// %
		int resto = 20 / 2;
		
		System.out.println("Valor "+resto);
		
		// < > <= >= == != return boolean value
		
		boolean isDezMaiorQueVinte = 10 > 20;
		boolean isDezMenorQueVinte = 10 < 20;
		boolean isDezMaiorIgualAVinte = 10 >= 20;
		boolean isDezMneorIgualAVinte = 10 <= 20;
		boolean isDezIgualVinte = 10 == 20;
		boolean isDezDiferenteDeVinte = 10 != 20;
		System.out.println("10 e maior que 20: " + isDezMaiorQueVinte);
		System.out.println("10 e menor que 20: " + isDezMenorQueVinte);
		System.out.println("10 e maior igual a 20: " + isDezMaiorIgualAVinte);
		System.out.println("10 e menor igual a 20: " + isDezMneorIgualAVinte);
		System.out.println("10 e igual a 20: " + isDezIgualVinte);
		System.out.println("10 e diferente de 20: " + isDezDiferenteDeVinte);
		
		// && (AND) || (OR) ! (NOT)
		
		// = += -= *= /= %= 
		
		double salario = 1800.00;
		salario += 1000; //2800
		salario -= 1000; //1800
		salario *= 2; //3600
		salario /= 2; //1800
		salario %= 2; //0
		System.out.println(salario);
		
		// ++ --
		
		int contador = 0;
		System.out.println(contador++); //executa tudo depois acrescenta
		contador = 0;
		System.out.println(++contador); //acrescenta depois executa

	}

}
