package devdojo.maratonajava.javacore.Lclassesabstratas.test;

import devdojo.maratonajava.javacore.Lclassesabstratas.domain.Desenvolvedor;
import devdojo.maratonajava.javacore.Lclassesabstratas.domain.Gerente;

public class FuncionarioTest01 {
	public static void main(String[] args) {
		Gerente g = new Gerente("Carlos", 5000.00);
		Desenvolvedor d = new Desenvolvedor("Rafael", 4900.00);
		
		System.out.println(g.toString());
		System.out.println(d.toString());
	}
}
