package devdojo.maratonajava.javacore.ZZDmethodreference.service;

import devdojo.maratonajava.javacore.ZZDmethodreference.domain.Anime;

public class AnimeComparetors {
	
	//method static
	public static int compareByTitle(Anime anime1, Anime anime2) {
		return anime1.getName().compareTo(anime2.getName());
	}
	
	//method non static
	public int compareByTitleNonStatic(Anime anime1, Anime anime2) {
		return anime1.getName().compareTo(anime2.getName());
	}
	
}
