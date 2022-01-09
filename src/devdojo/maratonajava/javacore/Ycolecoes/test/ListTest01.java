package devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
	public static void main(String[] args) {
		List<String> nomes = new ArrayList<>();
		List<String> nomes2 = new ArrayList<>();
		
		nomes.add("Rafael");
		nomes.add("Martins");
		
		nomes2.add("Milena");
		nomes2.add("Monica");
		
		//adiciona uma lista em outra
		nomes.addAll(nomes2);
		
		//pode remover pelo indice ou pelo valor
		nomes.remove("Monica");
		
		for(String nome:nomes) {
			System.out.println(nome);
		}
		
		for (int i = 0; i < nomes.size(); i++) {
			System.out.println(nomes.get(i));
		}
	}
}
