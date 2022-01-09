package devdojo.maratonajava.javacore.Npolimorfismo.test;

import devdojo.maratonajava.javacore.Npolimorfismo.repository.Repository;
import devdojo.maratonajava.javacore.Npolimorfismo.servico.SalvandoEmArquivo;
import devdojo.maratonajava.javacore.Npolimorfismo.servico.SalvandoEmBD;
import devdojo.maratonajava.javacore.Npolimorfismo.servico.SalvandoEmCloud;

public class RepositoryTest01 {
	public static void main(String[] args) {
		Repository repository1 = new SalvandoEmArquivo();
		repository1.salvar();
		
		Repository repository2 = new SalvandoEmBD();
		repository2.salvar();
		
		Repository repository3 = new SalvandoEmCloud();
		repository3.salvar();
	}
}
