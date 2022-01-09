package devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import devdojo.maratonajava.javacore.Ycolecoes.domain.Consumidor;
import devdojo.maratonajava.javacore.Ycolecoes.domain.Manga;

public class MapTest03 {
	public static void main(String[] args) {
		Consumidor consumidor1 = new Consumidor(1l, "Rafael");
		Consumidor consumidor2 = new Consumidor(2l, "Milena");
		
		Manga manga1 = new Manga(1l, "Pokemon", 10.25);
		Manga manga2 = new Manga(2l, "Dragon Ball", 7.30);
		Manga manga3 = new Manga(3l, "Naruto", 15.50);
		Manga manga4 = new Manga(4l, "Yugio", 3.75);
		
		List<Manga> c1 = new ArrayList<>();
		c1.add(manga1);
		c1.add(manga2);
		
		List<Manga> c2 = new ArrayList<>();
		c2.add(manga3);
		c2.add(manga4);
		
		Map<Consumidor,List<Manga>> cm = new HashMap<>(); 
		cm.put(consumidor1, c1);
		cm.put(consumidor2, c2);
		
		for(Map.Entry<Consumidor, List<Manga>> entry: cm.entrySet()) {
			System.out.print(entry.getKey().getNome() + ": ");
			for(Manga manga: entry.getValue()) {
				System.out.print(manga.getNome() + ", ");
			}
			System.out.println();
		}
		

	}
}
