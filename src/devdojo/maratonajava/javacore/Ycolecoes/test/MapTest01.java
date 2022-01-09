package devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.HashMap;
import java.util.Map;

public class MapTest01 {
	public static void main(String[] args) {
		
		//Map<K,J> basicamente garda uma chave e um valor dentro de um Set<>
		//HashMap<> ordena pelo Hash, ou seja n�o tem uma ordena��o definida
		//LinkedHashMap<> mantem uma ordena��o
		Map<String, String> map = new HashMap<>();
		
		//map trabalha sobre chave, valor
		//map n�o aceita chaves duplicadas
		map.put("Teklado", "teclado");
		map.put("mouze", "mouse");
		map.put("vc", "voc�");
		
		//retorna um Set<> de String
		//Set<String> keys = map.keySet();
		
		//pega a chave
		for(String key: map.keySet()) {
			System.out.println(key);
			//pega o valor atrav�s de uma chave
			System.out.println(map.get(key));
		}
		//pega o valor
		for(String value: map.values()) {
			System.out.println(value);
		}
		//d� acesso a chave e ao valor no mesmo for
		for(Map.Entry<String, String> entry: map.entrySet()) {
			System.out.println(entry.getKey() + " - " + entry.getValue());
		}
	}
}
