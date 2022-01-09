package devdojo.maratonajava.javacore.Npolimorfismo.servico;

import devdojo.maratonajava.javacore.Npolimorfismo.repository.Repository;

public class SalvandoEmArquivo implements Repository{

	@Override
	public void salvar() {
		System.out.println("Salvando em arquivo");
	}

}
