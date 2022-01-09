package devdojo.maratonajava.javacore.Npolimorfismo.servico;

import devdojo.maratonajava.javacore.Npolimorfismo.repository.Repository;

public class SalvandoEmCloud implements Repository{
	@Override
	public void salvar() {
		System.out.println("Salvando na nuvem");
	}
}
