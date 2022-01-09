package devdojo.maratonajava.javacore.Gassociacao.domain;

public class Jogador {
	private String nome;
	
	private Time time;

	public void imprime() {
		System.out.println(this.nome);
		if(this.time != null) {
			System.out.println(this.time.getNome());
		}
		System.out.println("----------");
	}
	
	public Jogador(String nome) {
		this.nome = nome;
	}

	public Jogador(String nome, Time time) {
		this.nome = nome;
		this.time = time;
	}

	public Time getTime() {
		return time;
	}

	public void setTime(Time time) {
		this.time = time;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
