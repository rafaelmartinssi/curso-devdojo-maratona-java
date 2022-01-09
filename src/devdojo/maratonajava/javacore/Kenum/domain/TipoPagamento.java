package devdojo.maratonajava.javacore.Kenum.domain;

public enum TipoPagamento {
	CREDITO(1),
	DEBITO(2);
	
	public final int VALOR;

	private TipoPagamento(int valor) {
		this.VALOR = valor;
	}
}
