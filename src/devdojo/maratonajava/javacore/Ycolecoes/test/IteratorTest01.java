package devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import devdojo.maratonajava.javacore.Ycolecoes.domain.Manga;

public class IteratorTest01 {
	public static void main(String[] args) {
		List<Manga> mangas = new ArrayList<>();
		mangas.add(new Manga(1l, "Pokemon", 10.25, 2));
		mangas.add(new Manga(3l, "Dragon Ball", 7.30, 0));
		mangas.add(new Manga(2l, "Naruto", 15.50, 5));
		mangas.add(new Manga(4l, "Yugio", 3.75, 8));
		
		//nunca tenter remover utilizando foreach
		
		Iterator<Manga> mangasIterator = mangas.iterator();
		
		//o hasNext() verifica se existe um próximo elemento (retorna um boolean)
		while(mangasIterator.hasNext()) {
			//next() traz retorna o objeto de fato
			if(mangasIterator.next().getQuantidade() == 0) {
				mangasIterator.remove();
			}
		}
		System.out.println(mangas);
		
		//outra forma de fazer mais fácil.
		mangas.removeIf(manga -> manga.getQuantidade() == 0);
		
		System.out.println(mangas);
	}
}
