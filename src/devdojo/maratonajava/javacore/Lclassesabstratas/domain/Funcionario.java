package devdojo.maratonajava.javacore.Lclassesabstratas.domain;

public abstract class Funcionario {
	protected String nome;
	protected double salario;
	
	public Funcionario(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Funcionario [nome=" + nome + ", salario=" + salario + "]";
	}
	
	public abstract void calcularBonus();
	
}
