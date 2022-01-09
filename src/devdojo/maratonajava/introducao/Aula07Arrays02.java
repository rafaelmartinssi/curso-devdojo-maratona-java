package devdojo.maratonajava.introducao;

public class Aula07Arrays02 {
	public static void main(String[] args) {
		
		String [] nomes = new String[3];
		nomes[0] = "Hinata";
		nomes[1] = "Sakura";
		nomes[2] = "Tsunade";
		
		for (int i = 0; i < nomes.length; i++) {
			System.out.println(nomes[i]);
		}
		System.out.println("-------------");
		for(String nome: nomes) {
			System.out.println(nome);
		}
		
	}
}
