package devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
	public static void main(String[] args) {
		
		double salario = 5000.0;
		String doar = "Posso doar";
		String naoDoar = "N�o posso doar";
		
		//resultado = (condi��o) ? verdadeiro : falso ;
		//sempre tem que ser atribuido a alguma vari�vel, se n�o n�o compila.
		
		String resultado = salario > 4000.0 ? doar : naoDoar;
		
		boolean result = salario > 4000.0 ? true : false;
		
		System.out.println(resultado);
		System.out.println(result);
		
	}
}
