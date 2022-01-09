package devdojo.maratonajava.javacore.Rdataseformatacao.test;

import java.util.Date;

public class DataTest01 {
	public static void main(String[] args) {
		//ninguém utiliza mais
		Date date = new Date(0L); //construtor recebe o valor em millesegundos
		System.out.println(date);
		
		Date date1 = new Date(); //agora
		System.out.println(date1);
		
	}
}
