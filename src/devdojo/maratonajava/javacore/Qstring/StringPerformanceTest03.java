package devdojo.maratonajava.javacore.Qstring;

public class StringPerformanceTest03 {
	public static void main(String[] args) {
		long inicio = System.currentTimeMillis();
		concatString(10_000);
		long fim = System.currentTimeMillis();
		
		long inicioSB = System.currentTimeMillis();
		concatStringBuilder(10_000);
		long fimSB = System.currentTimeMillis();
		
		System.out.println("Tempo gasto: " + (fim - inicio) + "ms");
		System.out.println("Tempo gasto SB: " + (fimSB - inicioSB) + "ms");
	}
	
	private static String concatString(int tamanho) {
		String texto = "";
		for(int i = 0; i < tamanho; i++) {
			texto += i;
		}
		return texto;
	}
	
	private static void concatStringBuilder(int tamanho) {
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < tamanho; i++) {
			sb.append(i);
		}
	}
}
