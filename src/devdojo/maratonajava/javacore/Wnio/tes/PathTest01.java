package devdojo.maratonajava.javacore.Wnio.tes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest01 {
	public static void main(String[] args) {		
		try {
			
			//cria path para pasta
			Path folderPath = Paths.get("pasta");
			
			//Verifica se a pasta já existe, se não fizer checagem lança exceção
			if(Files.notExists(folderPath)) {
				//cria diretorio, para criar diretorio com subpastas se usa createDirectories
				Path folderCreate = Files.createDirectory(folderPath);
				System.out.println(folderCreate);
			}
			
			//cria path para arquivo
			Path filePath = Paths.get(folderPath.toString(), "file.txt");
			
			//Verifica se o arquivo já existe, se não fizer checagem lança exceção
			if(Files.notExists(filePath)) {
				//cria arquivo
				Path fileCreate = Files.createFile(filePath);
				System.out.println(fileCreate);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
