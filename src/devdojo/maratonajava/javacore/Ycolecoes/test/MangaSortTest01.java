package devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import devdojo.maratonajava.javacore.Ycolecoes.domain.Manga;

//Comparator resolve o problema do compareble, podendo ordenar por qualquer um dos atributos
class MangaByIdComparator implements Comparator<Manga>{

	@Override
	public int compare(Manga arg0, Manga arg1) {
		return arg0.getNome().compareTo(arg1.getNome());
	}
	
}

public class MangaSortTest01 {
	public static void main(String[] args) {
		List<Manga> mangas = new ArrayList<>();
		mangas.add(new Manga(1l, "Pokemon", 10.25));
		mangas.add(new Manga(3l, "Dragon Ball", 7.30));
		mangas.add(new Manga(2l, "Naruto", 15.50));
		mangas.add(new Manga(4l, "Yugio", 3.75));
		
		for(Manga manga: mangas) {
			System.out.println(manga);
		}
		
		System.out.println("------------------------");
		
		//o objeto pode ser ordenado pq o compareble foi implementado na classe
		Collections.sort(mangas);
		for(Manga manga: mangas) {
			System.out.println(manga);
		}
		
		System.out.println("------------------------");
		
		//o objeto pode ser ordenado passado um objeto que atende a condição de "é um Comparator"
		//Collections.sort(mangas, new MangaByIdComparator());
		mangas.sort(new MangaByIdComparator());
		for(Manga manga: mangas) {
			System.out.println(manga);
		}
	}
}
