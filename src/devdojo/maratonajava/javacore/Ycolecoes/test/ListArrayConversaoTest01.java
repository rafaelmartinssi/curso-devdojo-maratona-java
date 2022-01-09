package devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListArrayConversaoTest01 {
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		//convertendo de List<> para Array[]
		Integer [] numbersArray = numbers.toArray(new Integer[0]);
		System.out.println(Arrays.toString(numbersArray));
		
		Integer [] numbersInteger = new Integer[3];
		numbersInteger[0] = 0;
		numbersInteger[1] = 1;
		numbersInteger[2] = 2;
		
		//fazendo processo inverso, convertendo de Array[] para List<>
		List<Integer> numbersList = new ArrayList<>(Arrays.asList(numbersInteger));
		System.out.println(numbersList);
		
		//asList serve para criar List<>
		Arrays.asList(1,2,3);
		
		//as List é imutavel, criando dessa forma ele nao pode ter valores adicionados
		List<String> strings = Arrays.asList("A","B","C");
		System.out.println(strings);
	}
}
