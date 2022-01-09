package devdojo.maratonajava.javacore.Uregex.test;

import java.util.Scanner;

public class ScannerTest02 {
	public static void main(String[] args) {
		String texto = "Rafael,Mateus,Carla,José,200,true";
		Scanner scanner = new Scanner(texto);
		scanner.useDelimiter(",");
		
		while(scanner.hasNext()) {
			System.out.println(scanner.next());
			if(scanner.hasNextInt()) {
				System.out.println("int " + scanner.nextInt());
			}
			if(scanner.hasNextInt()) {
				System.out.println("int " + scanner.nextInt());
			}
		}
		
		scanner.close();
	}
}
