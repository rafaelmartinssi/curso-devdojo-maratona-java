package devdojo.maratonajava.javacore.ZZAclassesinternas;

public class InnerClassesTest01 {
	
	private String name = "Teste";
	
	class Inner{
		public void printOuterClassAttribute() {
			System.out.println(name);
		}
	}
	
	public static void main(String[] args) {
		InnerClassesTest01 outer = new InnerClassesTest01();
		Inner inner = outer.new Inner();
		
		//outra forma de criar uma variável de instância
		Inner inner2 = new InnerClassesTest01().new Inner();
		
		inner.printOuterClassAttribute();
		inner2.printOuterClassAttribute();
	}
}
