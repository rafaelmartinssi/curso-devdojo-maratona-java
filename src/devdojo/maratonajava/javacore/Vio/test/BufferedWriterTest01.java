package devdojo.maratonajava.javacore.Vio.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterTest01 {
	public static void main(String[] args) {
		File file = new File("file.txt");
		
		//true da um append no arquivo, sem apagar o que já tinha
		try (FileWriter fw = new FileWriter(file, true);
			//BufferedWriter encapsula a FileReader, trás melhor eficiência
			BufferedWriter writer = new BufferedWriter(fw)) {
			//escreve no arquivo
			writer.write("Curso Java");
			//pula para a próxima linha no arquivo
			writer.newLine();
			//garante que todos os dados sejam trasmitidos
			writer.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
