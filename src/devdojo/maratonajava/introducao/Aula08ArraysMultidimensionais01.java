package devdojo.maratonajava.introducao;

public class Aula08ArraysMultidimensionais01 {
	public static void main(String[] args) {
		
		int [][] calendar = new int [3][3];
		
		calendar[0][0] = 1;
		calendar[0][1] = 2;
		calendar[0][2] = 3;
		calendar[1][0] = 4;
		calendar[1][1] = 5;
		calendar[1][2] = 6;
		calendar[2][0] = 7;
		calendar[2][1] = 8;
		calendar[2][2] = 9;
		
		// outra forma de inicialização
		// int [][] array = {{1,2,3},{4,5},{6,7,8,9}};
		
		// outra forma de inicialização
		//int [][] array1 = new int[2][];
		//array1[0] = new int [2];
		//array1[1] = new int [3];
		
		for(int i = 0; i < calendar.length; i++) {
			System.out.println();
			System.out.print("Vetor " + i + ": ");
			for (int j = 0; j < calendar[i].length; j++) {
				System.out.print(calendar[i][j]);
			}
		}
		
		for(int[] i: calendar) {
			System.out.println();
			for(int j: i) {
				System.out.print(j);
			}
		}
		
	}
}
