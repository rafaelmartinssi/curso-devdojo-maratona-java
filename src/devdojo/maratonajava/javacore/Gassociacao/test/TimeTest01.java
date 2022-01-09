package devdojo.maratonajava.javacore.Gassociacao.test;

import devdojo.maratonajava.javacore.Gassociacao.domain.Jogador;
import devdojo.maratonajava.javacore.Gassociacao.domain.Time;

public class TimeTest01 {
	public static void main(String[] args) {
		
		Jogador jogador1 = new Jogador("Neymar");
		Jogador jogador2 = new Jogador("Pele");
		Jogador jogador3 = new Jogador("Maradona");
		
		Jogador[]jogadores = new Jogador[] {jogador1, jogador2, jogador3};
		
		Time time = new Time("Flamengo", jogadores);
		
		time.imprime();
		
		
		
	}
}
