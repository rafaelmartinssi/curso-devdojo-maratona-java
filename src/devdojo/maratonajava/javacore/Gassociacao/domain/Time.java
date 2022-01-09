package devdojo.maratonajava.javacore.Gassociacao.domain;

public class Time {
	private String nome;
	
	private Jogador [] jogadores;
	
	public void imprime() {
		System.out.println(this.nome);
		for(Jogador jogador : this.jogadores) {
			System.out.print(jogador.getNome() + ", ");
		}
		System.out.println();
		System.out.println("---------------------------");

	}
	
	public Time(String nome, Jogador[] jogadores) {
		super();
		this.nome = nome;
		this.jogadores = jogadores;
	}
	
	public Time(String nome) {
		this.nome = nome;
	}

	public Jogador[] getJogadores() {
		return jogadores;
	}

	public void setJogadores(Jogador[] jogadores) {
		this.jogadores = jogadores;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
