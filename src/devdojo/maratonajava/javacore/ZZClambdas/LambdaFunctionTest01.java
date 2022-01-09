package devdojo.maratonajava.javacore.ZZClambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class LambdaFunctionTest01 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Rafael");
		list.add("Raul");
		list.add("Marieta");
		list.add("Carla");
		list.add("Monica");
		
		List<Integer> integers = map(list, s -> s.length());
		System.out.println(integers);
	}
	
	public static <T,R> List<R> map(List<T> list, Function<T, R> function){
		List<R> result = new ArrayList<>();
		for(T e: list) {
			R r = function.apply(e);
			result.add(r);
		}
		
		return result;
	}
}
