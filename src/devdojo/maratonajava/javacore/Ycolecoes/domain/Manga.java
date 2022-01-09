package devdojo.maratonajava.javacore.Ycolecoes.domain;

import java.util.Objects;

public class Manga implements Comparable<Manga>{
	private Long id;
	private String nome;
	private double preco;
	private int quantidade;
	
	public Manga(Long id, String nome, double preco) {
		Objects.requireNonNull(id, "não pode ser nulo");
		Objects.requireNonNull(nome, "não pode ser nulo");
		Objects.requireNonNull(preco, "não pode ser nulo");
		this.id = id;
		this.nome = nome;
		this.preco = preco;
	}
	public Manga(Long id, String nome, double preco, int quantidade) {
		this(id, nome, preco);
		this.quantidade = quantidade;
	}

	@Override
	public String toString() {
		return "Manga [id=" + id + ", nome=" + nome + ", preco=" + preco + "]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Manga other = (Manga) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
	//precisa ser implementado para ordenação com objetos com compareble
	//implementado na classe
	//o problema do compareble é que ele pode ser utilizado com apenas um argumento
	//ou seja se eu estiver ordenando por nome e só por nome, se for por id é só por id.
	@Override
	public int compareTo(Manga arg) {
		//negativo se o this < arg
		//se this == arg, return 0
		//positivo se this > arg
		
		//if(this.id < arg.getId()) {
		//	return -1;
		//} else if(this.id.equals(arg.getId())) {
		//	return 0;
		//}
		//else {
		//	return 1;
		//}
		
		//se precisa ordenar por um primitivo
		//return Double.compare(preco, arg.getPreco());
		
		//se ordenar por string
		//return this.nome.compareTo(arg.getNome());
		
		return this.id.compareTo(arg.getId());
	}

}
