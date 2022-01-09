package devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.HashSet;
import java.util.Set;

import devdojo.maratonajava.javacore.Ycolecoes.domain.Manga;

public class SetTest01 {
	public static void main(String[] args) {
		//Set<> n�o permite elementos repedidos
		//HashSet<> n�o garente ordem dentro da lista, s�o organizados aleatoriamente, n�o � indexado
		Set<Manga> mangas = new HashSet<>();
		mangas.add(new Manga(1l, "Pokemon", 10.25, 2));
		mangas.add(new Manga(3l, "Dragon Ball", 7.30, 0));
		mangas.add(new Manga(2l, "Naruto", 15.50, 5));
		mangas.add(new Manga(5l, "OnePathMan", 8.75, 6));
		mangas.add(new Manga(4l, "Yugio", 3.75, 8));
		
		for(Manga manga: mangas) {
			System.out.println(manga);
		}
	}
}
