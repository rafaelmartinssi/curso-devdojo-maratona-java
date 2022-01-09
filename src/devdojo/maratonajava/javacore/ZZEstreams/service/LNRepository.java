package devdojo.maratonajava.javacore.ZZEstreams.service;

import java.util.List;

import devdojo.maratonajava.javacore.ZZEstreams.domain.LightNovel;

public interface LNRepository {
	
	List<LightNovel> getAll();
	
}
