package devdojo.maratonajava.javacore.ZZEstreams.service;

import java.util.ArrayList;
import java.util.List;

import devdojo.maratonajava.javacore.ZZEstreams.domain.LightNovel;

public class LNRepositoryImpl implements LNRepository{

	List<LightNovel> list = new ArrayList<LightNovel>();
	
	@Override
	public List<LightNovel> getAll() {
		list.add(new LightNovel("Naruto", 15.40));
		list.add(new LightNovel("Boruto", 10.70));
		list.add(new LightNovel("Dragon Ball", 13.00));
		list.add(new LightNovel("Cavaleiros do Zodíaco", 18.90));
		list.add(new LightNovel("Fullmetal", 20.30));
		list.add(new LightNovel("One Puch Man", 7.10));
		list.add(new LightNovel("Pokemon", 5.60));
		
		
		return list;
	}

}
