package devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao01 {
	public static void main(String[] args) {
		
		int count = 0;
		
		while (count < 10) {
			System.out.println(++count);
		}
		
		do {
			//executa pelo menos uma vez a condição, mesmo que ela seja falsa
			System.out.println(count++);
		}while(count != 20);
		
		for(int i = 0; i < 100; i++) {
			if(i % 2 == 0) {
				System.out.print(i);
			}
		}
	}
}
