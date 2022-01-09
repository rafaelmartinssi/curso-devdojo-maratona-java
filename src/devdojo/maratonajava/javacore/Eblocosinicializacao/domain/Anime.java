package devdojo.maratonajava.javacore.Eblocosinicializacao.domain;

public class Anime {
	private String nome;
	private int [] episodios;
	
	/*
	 * ORDEM
	 * 0 - bloco de inicialização estático e executado quando a JVM carrega a classe
	 * 1 - alocado espaço em memória para o objeto
	 * 2 - Cada atributo da classe é criado e inicializado com valores default ou o 
	 * que for passado cv bm,
	 * 3 - Bloco de inicializ,01ação é executado
	 * 4 - Construtor é executado
	 * */
	
	
	//bloco de inicialização
	//executado antes do construto
	//executado sempre que for criado um objeto
	{
		episodios = new int [] {1,2,3,4,5,6,7,8,9,10};
	}
	
	public Anime() {

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int[] getEpisodios() {
		return episodios;
	}

	public void setEpisodios(int[] episodios) {
		this.episodios = episodios;
	}
	
}
