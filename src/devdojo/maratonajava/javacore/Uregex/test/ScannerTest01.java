package devdojo.maratonajava.javacore.Uregex.test;

public class ScannerTest01 {
	public static void main(String[] args) {
		String texto = "Rafael, Mateus, Carla, Jos�";
		String[] nomes = texto.split(",");
		for(String nome: nomes) {
			System.out.println(nome.trim());
		}
	}
}
