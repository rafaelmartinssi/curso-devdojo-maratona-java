package devdojo.maratonajava.javacore.ZZAclassesinternas;

class Animal{
	public void walking() {
		System.out.println("Caminhando");
	}
}

public class AnonymousClassesTest01 {
	
	public static void main(String[] args) {
		
		//ao adiciona o {} ela se torna uma classe anônima.
		//neste caso ela se torna uma classe diferente, uma SUBCLASSE de Animal
		//que será valida apenas naquele momento, 
		//não poderá ser utilizada em nenhuma outra parte do código
		Animal animal = new Animal() {
			@Override
			public void walking() {
				System.out.println("Walkingt in the shadow!");
			}
		};
		animal.walking();
	}
}
