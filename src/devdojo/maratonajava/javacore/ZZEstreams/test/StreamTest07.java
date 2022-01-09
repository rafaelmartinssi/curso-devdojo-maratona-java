package devdojo.maratonajava.javacore.ZZEstreams.test;

import java.util.List;

import devdojo.maratonajava.javacore.ZZEstreams.domain.LightNovel;
import devdojo.maratonajava.javacore.ZZEstreams.service.LNRepository;
import devdojo.maratonajava.javacore.ZZEstreams.service.LNRepositoryImpl;

public class StreamTest07 {
	public static void main(String[] args) {	
		
		//pelo que entendi o reduce faz operações com os itens dentro do stream e retorna um valor de acordo a operação.
	
		LNRepository repository = new LNRepositoryImpl();
		List<LightNovel> lightNovels = repository.getAll();
		
		lightNovels.stream().map(LightNovel::getPrice)
			.reduce((x,y) -> x + y) //retorna um optional
			.ifPresent(System.out::println);
		
		lightNovels.stream().map(LightNovel::getPrice)
		.reduce(0.0, (x,y) -> x + y); //pode ser adicionado um valor inicial, dessa forma não retorna mais um optional.

		//utilizando method reference
		lightNovels.stream().map(LightNovel::getPrice)
		.reduce(Double::sum);
		
	}
}
