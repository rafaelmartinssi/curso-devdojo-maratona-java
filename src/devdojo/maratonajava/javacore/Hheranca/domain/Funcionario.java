package devdojo.maratonajava.javacore.Hheranca.domain;

public class Funcionario extends Pessoa{

	private double salario;

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	// lembrar como � chamado o construtor da super classe acima super();
	public Funcionario() {
		super();
	}
	public Funcionario(String nome, String cpf, double salario) {
		super(nome, cpf);
		this.salario = salario;
	}
	
	// lembrar como � chamado o metodo acima super.method();
	@Override
	public void imprime() {
		super.imprime();
		System.out.println(this.salario);
	}
	
	//s� � possivel acessar a vari�vel nome diretamente pelo this. por que 
	//ela est� como protected.
	//� poss�vel acessar uma vari�vel diretamente como protected por todas 
	//as classes filhas ou no mesmo package
	public void relatorio() {
		System.out.println("Eu " + this.nome + ", recebi de sal�rio a quantia de " + this.salario + " reais.");
	}
	
}
