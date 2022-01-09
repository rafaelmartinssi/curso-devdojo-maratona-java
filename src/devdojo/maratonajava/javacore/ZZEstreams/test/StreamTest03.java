package devdojo.maratonajava.javacore.ZZEstreams.test;

import java.util.List;

import devdojo.maratonajava.javacore.ZZEstreams.domain.LightNovel;
import devdojo.maratonajava.javacore.ZZEstreams.service.LNRepository;
import devdojo.maratonajava.javacore.ZZEstreams.service.LNRepositoryImpl;

public class StreamTest03 {
	public static void main(String[] args) {		
	
		LNRepository repository = new LNRepositoryImpl();
		List<LightNovel> lightNovels = repository.getAll();
		
		lightNovels.forEach(System.out::print);
		
		System.out.println("----");
		
		Long r = lightNovels.stream()
			.filter(ln -> ln.getPrice() < 15)
			.count();
		
		System.out.println(r);
	}
}
