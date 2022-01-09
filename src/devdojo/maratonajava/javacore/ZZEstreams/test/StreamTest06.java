package devdojo.maratonajava.javacore.ZZEstreams.test;

import java.util.List;

import devdojo.maratonajava.javacore.ZZEstreams.domain.LightNovel;
import devdojo.maratonajava.javacore.ZZEstreams.service.LNRepository;
import devdojo.maratonajava.javacore.ZZEstreams.service.LNRepositoryImpl;

public class StreamTest06 {
	public static void main(String[] args) {		
	
		LNRepository repository = new LNRepositoryImpl();
		List<LightNovel> lightNovels = repository.getAll();
		
		System.out.println(lightNovels.stream().anyMatch(ln -> ln.getPrice() > 20.00)); //retorna boolean se houver correspondência para pelo menos um item
		System.out.println(lightNovels.stream().allMatch(ln -> ln.getPrice() > 20.00)); //retorna boolean se houver correspondência para todos os itens
		System.out.println(lightNovels.stream().noneMatch(ln -> ln.getPrice() < 0.00)); //retorna boolean se não houver correspondência para todos os itens
		lightNovels.stream()
			.filter(ln -> ln.getPrice() > 15)
			.findAny() //retorna qualquer item correspondente. OBS: retorna um Optional, por isso é nescessário tratamento encadeado com orElsethrow, orElse ou qualquer outro
			.ifPresent(System.out::println);
	
		lightNovels.stream()
			.filter(ln -> ln.getPrice() > 15)
			.findFirst() //retorna o primeiro item correspondente. OBS: mesma coisa do .findAny()
			.ifPresent(System.out::println);
		
	}
}
