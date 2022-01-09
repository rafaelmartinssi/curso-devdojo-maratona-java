package devdojo.maratonajava.javacore.Npolimorfismo.domain;

public class Tomate extends Produto{

	public static final double IMPOSTO = 0.06;
	
	private String validade;
	
	public Tomate(String nome, double valor, String validade) {
		super(nome, valor);
		this.validade = validade;
	}
	
	@Override
	public double calcularImposto() {
		System.out.println("Calculando imposto do tomate");
		return this.valor * IMPOSTO;
	}

	public String getValidade() {
		return validade;
	}

	public void setValidade(String validade) {
		this.validade = validade;
	}
	
}
