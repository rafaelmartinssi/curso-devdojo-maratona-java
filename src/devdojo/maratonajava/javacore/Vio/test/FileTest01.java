package devdojo.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.IOException;

public class FileTest01 {
	public static void main(String[] args) {
		File file = new File("file.txt");
		
		try {
			boolean isCreated = file.createNewFile();
			System.out.println(isCreated);
			
			System.out.println(file.getAbsolutePath());
			
			boolean isDeleted = file.delete();
			System.out.println(isDeleted);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
