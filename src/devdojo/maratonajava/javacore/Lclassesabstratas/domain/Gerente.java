package devdojo.maratonajava.javacore.Lclassesabstratas.domain;

public class Gerente extends Funcionario{

	public Gerente(String nome, double salario) {
		super(nome, salario);
		calcularBonus();
	}

	@Override
	public String toString() {
		return "Gerente [nome=" + nome + ", salario=" + salario + "]";
	}

	@Override
	public void calcularBonus() {
		this.salario *= 1.1;
	}

}
