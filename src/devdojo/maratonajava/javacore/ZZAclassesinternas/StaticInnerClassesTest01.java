package devdojo.maratonajava.javacore.ZZAclassesinternas;

public class StaticInnerClassesTest01 {
	private String nome = "Rafael";
	
	//static faz com que a classe funcione como se fosse independente, como se estivesse fora
	static class Nested{
		public void print() {
			//não tem acesso as instance variables diretamente 
			System.out.println(new StaticInnerClassesTest01().nome);
		}
	}
	
	public static void main(String[] args) {
		//pode chamar direto
		Nested nested = new Nested();
		
		nested.print();
	}
}
