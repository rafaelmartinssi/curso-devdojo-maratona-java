package devdojo.maratonajava.javacore.Hheranca.domain;

public class Funcionario extends Pessoa{

	private double salario;

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	// lembrar como é chamado o construtor da super classe acima super();
	public Funcionario() {
		super();
	}
	public Funcionario(String nome, String cpf, double salario) {
		super(nome, cpf);
		this.salario = salario;
	}
	
	// lembrar como é chamado o metodo acima super.method();
	@Override
	public void imprime() {
		super.imprime();
		System.out.println(this.salario);
	}
	
	//só é possivel acessar a variável nome diretamente pelo this. por que 
	//ela está como protected.
	//é possível acessar uma variável diretamente como protected por todas 
	//as classes filhas ou no mesmo package
	public void relatorio() {
		System.out.println("Eu " + this.nome + ", recebi de salário a quantia de " + this.salario + " reais.");
	}
	
}
