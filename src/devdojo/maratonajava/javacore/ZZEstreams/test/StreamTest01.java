package devdojo.maratonajava.javacore.ZZEstreams.test;

import java.util.ArrayList;
import java.util.List;

import devdojo.maratonajava.javacore.ZZEstreams.domain.LightNovel;
import devdojo.maratonajava.javacore.ZZEstreams.service.LNRepository;
import devdojo.maratonajava.javacore.ZZEstreams.service.LNRepositoryImpl;

public class StreamTest01 {
	public static void main(String[] args) {		
	
		LNRepository repository = new LNRepositoryImpl();
		List<LightNovel> lightNovels = repository.getAll();
		
		lightNovels.sort((l1, l2) -> l1.getTitle().compareTo(l2.getTitle()));
		//lightNovels.sort(Comparator.comparing(LightNovel::getTitle));
		
		List<String> titles = new ArrayList<>();
		for(LightNovel item:lightNovels) {
			if(item.getPrice()<15) {
				titles.add(item.getTitle());
			}
		}
		
		System.out.println(lightNovels);
		
		System.out.println(titles);
	}
}
