package devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.HashMap;
import java.util.Map;

import devdojo.maratonajava.javacore.Ycolecoes.domain.Consumidor;
import devdojo.maratonajava.javacore.Ycolecoes.domain.Manga;

public class MapTest02 {
	public static void main(String[] args) {
		Consumidor consumidor1 = new Consumidor(1l, "Rafael");
		Consumidor consumidor2 = new Consumidor(2l, "Milena");
		
		Manga manga1 = new Manga(1l, "Pokemon", 10.25);
		Manga manga2 = new Manga(2l, "Dragon Ball", 7.30);
		
		Map<Consumidor,Manga> cm = new HashMap<>(); 
		cm.put(consumidor1, manga1);
		cm.put(consumidor2, manga2);
		
		for(Map.Entry<Consumidor, Manga> entry: cm.entrySet()) {
			System.out.println(entry.getKey().getNome() + " - " + entry.getValue().getNome());
		}
	}
}
