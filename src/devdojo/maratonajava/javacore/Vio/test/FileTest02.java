package devdojo.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.IOException;

public class FileTest02 {
	public static void main(String[] args) {
		try {
			File folder = new File("folder"); 
			boolean isCreatedFolder = folder.mkdir();
			System.out.println(isCreatedFolder);
			
			File file = new File(folder ,"file.txt");
			boolean isCreated = file.createNewFile();
			System.out.println(isCreated);			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
