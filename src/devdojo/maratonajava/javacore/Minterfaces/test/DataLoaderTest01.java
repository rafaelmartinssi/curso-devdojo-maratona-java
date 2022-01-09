package devdojo.maratonajava.javacore.Minterfaces.test;

import devdojo.maratonajava.javacore.Minterfaces.domain.DatabaseLoader;
import devdojo.maratonajava.javacore.Minterfaces.domain.FileLoader;

public class DataLoaderTest01 {
	public static void main(String[] args) {
		DatabaseLoader data = new DatabaseLoader();
		FileLoader file = new FileLoader();
		
		data.load();
		file.load();
		
		data.remover();
		file.remover();
		
		data.teste();
	}
}
