package devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
	public static void main(String[] args) {
		
		double salario = 5000.0;
		String doar = "Posso doar";
		String naoDoar = "Não posso doar";
		
		//resultado = (condição) ? verdadeiro : falso ;
		//sempre tem que ser atribuido a alguma variável, se não não compila.
		
		String resultado = salario > 4000.0 ? doar : naoDoar;
		
		boolean result = salario > 4000.0 ? true : false;
		
		System.out.println(resultado);
		System.out.println(result);
		
	}
}
