package devdojo.maratonajava.javacore.ZZEstreams.test;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import devdojo.maratonajava.javacore.ZZEstreams.domain.LightNovel;
import devdojo.maratonajava.javacore.ZZEstreams.service.LNRepository;
import devdojo.maratonajava.javacore.ZZEstreams.service.LNRepositoryImpl;

public class StreamTest02 {
	public static void main(String[] args) {		
	
		LNRepository repository = new LNRepositoryImpl();
		List<LightNovel> lightNovels = repository.getAll();
		
		List<String> titles = lightNovels.stream()
			.sorted(Comparator.comparing(LightNovel::getTitle)) //ordena o stream por algum critério
			.filter(ln -> ln.getPrice() < 15) //filtra os itens através de um predicate 
			.limit(3) //limita os itens 
			.map(LightNovel::getTitle) //retorna (transforma) a saída em um tipo deferente (contido) da lista original (extrai os dados que você quer trabalhar)
			.collect(Collectors.toList()); //coleta (transforma) os dados de stream para list
		
		System.out.println(titles);
	}
}
