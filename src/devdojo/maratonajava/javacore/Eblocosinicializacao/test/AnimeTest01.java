package devdojo.maratonajava.javacore.Eblocosinicializacao.test;

import devdojo.maratonajava.javacore.Eblocosinicializacao.domain.Anime;

public class AnimeTest01 {
	public static void main(String[] args) {
		Anime anime = new Anime();
		for(int num: anime.getEpisodios()) {
			System.out.print(num + " ");
		}
	}
}
