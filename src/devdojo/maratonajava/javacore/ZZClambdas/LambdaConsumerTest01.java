package devdojo.maratonajava.javacore.ZZClambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class LambdaConsumerTest01 {
	
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Rafael");
		list.add("João");
		list.add("Maria");
		list.add("Carla");
		list.add("Monica");
		
		forEach(list, s -> System.out.println(s));

	}
	
	public static <T> void forEach(List<T> list, Consumer<T> consumer) {
		for(T e: list) {
			consumer.accept(e);
		}
	}

}
