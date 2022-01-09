package devdojo.maratonajava.javacore.ZZEstreams.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest09 {
	public static void main(String[] args) {	
		
		//criando streams
		
		IntStream.rangeClosed(1, 50).filter(n -> n % 2 == 0).forEach(n -> System.out.println(n + " "));
		
		Stream.of("Rafael", "Martins", "Galdino")
			.map(String::toUpperCase)
			.forEach(s -> System.out.println(s + " "));
		
		int [] nums = {1,2,3,4,5};
		OptionalDouble result = Arrays.stream(nums).average();
		double teste = result.getAsDouble();
		System.out.println(teste);
		
		try(Stream<String> lines = Files.lines(Paths.get("file.txt"))){
			lines.filter(l -> l.contains("Java")).forEach(System.out::println);
		}catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
