package devdojo.maratonajava.introducao;

public class Aula07Arrays01 {
	public static void main(String[] args) {
		
		// PADRÕES DE INICIALIZAÇÃO
		// byte, short, int, long = 0
		// float, double = 0.0
		// char '\u0000' = ''
		// boolean = false
		// String, Object = null

		//formas de inicialização de valores
		int[] array1 = new int[3];
		int[] array2 = {10,15,20};
		int[] array3 = new int[]{10,15,20};
		array1[0] = 10;
		array1[1] = 15;
		array1[2] = 13;
		
		for(int item : array1) {
			System.out.println(item);
		}
		
		for(int item : array2) {
			System.out.println(item);
		}
		
		for(int item : array3) {
			System.out.println(item);
		}
		
	}
}
