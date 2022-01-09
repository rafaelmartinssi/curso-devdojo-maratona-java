package devdojo.maratonajava.javacore.Qstring;

public class StringTest01 {
	public static void main(String[] args) {
		//String são imutaveis
		String nome = "Rafael"; //String constant pool
		String nome2 = "Rafael";
		System.out.println(nome == nome2);
		
		nome.concat(" Martins"); //não altera
		System.out.println(nome);
		
		nome = nome.concat(" Martins"); //apenas mudou a referência para uma nova string dentro do pool
		System.out.println(nome);
		System.out.println(nome == nome2); //não são mais iguais
		
		String nome3 = new String("Rafael"); //cria um objeto string dentro do heap, não vai para o pool
		System.out.println(nome2 == nome3); //fazem referência para coisas diferentes
		System.out.println(nome2 == nome3.intern()); //compara os valores internos
		
		/*
		 * muito importante
		 * == compara se as variaveis fazem referência para o mesmo objeto ou string dentro do pool
		 * equals compara se os valores das variaveis são iguais
		 * */
	}
}
