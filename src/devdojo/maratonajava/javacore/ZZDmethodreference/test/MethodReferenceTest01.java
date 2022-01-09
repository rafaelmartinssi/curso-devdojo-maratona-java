package devdojo.maratonajava.javacore.ZZDmethodreference.test;

import java.util.ArrayList;
import java.util.List;

import devdojo.maratonajava.javacore.ZZDmethodreference.domain.Anime;
import devdojo.maratonajava.javacore.ZZDmethodreference.service.AnimeComparetors;

public class MethodReferenceTest01 {
	public static void main(String[] args) {
		
		List<Anime> animes = new ArrayList<Anime>();
		animes.add(new Anime("Naruto", 500));
		animes.add(new Anime("Dragon Ball", 1500));
		animes.add(new Anime("One Puch Man", 300));
		animes.add(new Anime("Cavaleiros do Zodíaco", 200));
		animes.add(new Anime("Invencível", 100));
		
		//lambda
		animes.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));
		
		//method reference - method static
		animes.sort(AnimeComparetors::compareByTitle);
		System.out.println(animes);
		
		System.out.println("--------------");
		
		//method reference - method NON static
		AnimeComparetors comparetors = new AnimeComparetors();
		animes.sort(comparetors::compareByTitleNonStatic);
		System.out.println(animes);
		
	}
}
