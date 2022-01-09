package devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortTest01 {
	public static void main(String[] args) {
		List<String> mangas = new ArrayList<>();
		mangas.add("Pokemon");
		mangas.add("Dragon Ball");
		mangas.add("Naruto");
		mangas.add("Yugio");
		
		//Forma de ordenação simples para string e wrappers
		Collections.sort(mangas);
		
		for(String manga: mangas) {
			System.out.println(manga);
		}
	}
}
