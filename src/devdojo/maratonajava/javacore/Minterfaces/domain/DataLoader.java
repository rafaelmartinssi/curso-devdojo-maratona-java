package devdojo.maratonajava.javacore.Minterfaces.domain;

public interface DataLoader {
	
	//todos os m�todos de uma interface por padr�o s�o public e abstract
	void load();
	
	//m�todo concreto tamb�m abrigatoriamente � public
	default void teste() {
		System.out.println("exemplo de m�todo concreto");
	}
}
