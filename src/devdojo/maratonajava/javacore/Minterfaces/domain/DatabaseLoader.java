package devdojo.maratonajava.javacore.Minterfaces.domain;

public class DatabaseLoader implements DataLoader, DataRemover{

	@Override
	public void load() {
		System.out.println("Carregando dados do banco de dados!");
	}

	@Override
	public void remover() {
		System.out.println("Removendo do banco de dados!");
	}

}
