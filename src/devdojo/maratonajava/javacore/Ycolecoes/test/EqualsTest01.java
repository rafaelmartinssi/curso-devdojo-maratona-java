package devdojo.maratonajava.javacore.Ycolecoes.test;

import devdojo.maratonajava.javacore.Ycolecoes.domain.Smartphone;

public class EqualsTest01 {
	public static void main(String[] args) {
		Smartphone s1 = new Smartphone("ABC", "Iphone");
		Smartphone s2 = new Smartphone("ABCD", "Iphone");
		System.out.println(s1.equals(s2));
	}
}
