package devdojo.maratonajava.javacore.Zgenerics.test;

import java.util.ArrayList;
import java.util.List;

import devdojo.maratonajava.javacore.Zgenerics.domain.Carro;

public class MetodoGenericoTest01 {
	public static void main(String[] args) {

		criarLista(new Carro("FORD"));
		
		List<Carro> lista = criarListaComRetorno(new Carro("BMW"));
		System.out.println(lista);
		
	}
	
	//para criar um método generico e nescessário colocar o <T>
	//antes do tipo de retorno do método obrigatoriamente.
	//exemplo de metodo sem retorno
	public static <T> void criarLista(T t) {
		List<T> lista = new ArrayList<>();
		lista.add(t);
	}
	
	//exemplo de metodo com retorno
	public static <T> List<T> criarListaComRetorno(T t) {
		List<T> lista = new ArrayList<>();
		lista.add(t);
		return lista;
	}
}
