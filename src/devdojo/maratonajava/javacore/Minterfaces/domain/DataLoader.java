package devdojo.maratonajava.javacore.Minterfaces.domain;

public interface DataLoader {
	
	//todos os métodos de uma interface por padrão são public e abstract
	void load();
	
	//método concreto também abrigatoriamente é public
	default void teste() {
		System.out.println("exemplo de método concreto");
	}
}
