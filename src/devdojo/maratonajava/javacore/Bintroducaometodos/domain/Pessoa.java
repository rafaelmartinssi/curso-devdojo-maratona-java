package devdojo.maratonajava.javacore.Bintroducaometodos.domain;

public class Pessoa {
	
	private String nome;
	private int idade;
	
	public Pessoa() {

	}
	
	public Pessoa(String nome){
		this.nome = nome;
	}
	public Pessoa(String nome, int idade) {
		this(nome);
		this.idade = idade;
	}
	public void imprime() {
		System.out.println(this.nome);
		System.out.println(this.idade);
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return this.nome;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public int getIdade() {
		return this.getIdade();
	}

}
