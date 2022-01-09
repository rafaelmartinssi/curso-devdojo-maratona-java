package devdojo.maratonajava.javacore.ZZEoptional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptionalTest01 {
	public static void main(String[] args) {
		Optional<String> o1 = Optional.of("frase para testar optional");
		Optional<String> o2 = Optional.ofNullable(null);
		Optional<String> o3 = Optional.empty();
		System.out.println(o1);
		System.out.println(o2);
		System.out.println(o3);
		System.out.println("----------");
		
		Optional<String> result = findName("Gatoo");
		System.out.println(result.get());
		
	}
	
	private static Optional<String> findName(String s){
		List<String> list = new ArrayList<String>();
		list.add("Gato");
		list.add("Cavalo");
		
		int i = list.indexOf(s);
		
		if(i != 1) {
			return Optional.of(list.get(i));
		}
		
		return Optional.empty();
	}
}
