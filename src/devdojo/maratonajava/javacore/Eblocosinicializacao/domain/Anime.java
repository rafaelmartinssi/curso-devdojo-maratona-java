package devdojo.maratonajava.javacore.Eblocosinicializacao.domain;

public class Anime {
	private String nome;
	private int [] episodios;
	
	/*
	 * ORDEM
	 * 0 - bloco de inicializa��o est�tico e executado quando a JVM carrega a classe
	 * 1 - alocado espa�o em mem�ria para o objeto
	 * 2 - Cada atributo da classe � criado e inicializado com valores default ou o 
	 * que for passado cv bm,
	 * 3 - Bloco de inicializ,01a��o � executado
	 * 4 - Construtor � executado
	 * */
	
	
	//bloco de inicializa��o
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
