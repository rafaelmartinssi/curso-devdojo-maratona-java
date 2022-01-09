package devdojo.maratonajava.javacore.Hheranca.test;

import devdojo.maratonajava.javacore.Hheranca.domain.Funcionario;
import devdojo.maratonajava.javacore.Hheranca.domain.Pessoa;

public class HerancaTest01 {
	public static void main(String[] args) {
		Pessoa p = new Pessoa();
		p.setNome("Rafael");
		p.setCpf("000.000.000-00");
		p.imprime();
		
		System.out.println("-----------------");
		Funcionario f = new Funcionario();
		f.setNome("Mateus");
		f.setCpf("111.111.111-11");
		f.setSalario(2100.00);
		f.imprime();
		f.relatorio();
		
		
	}
}
