package devdojo.maratonajava.javacore.Gassociacao.test;

import devdojo.maratonajava.javacore.Gassociacao.domain.Jogador;
import devdojo.maratonajava.javacore.Gassociacao.domain.Time;

public class JogadorTest01 {
	public static void main(String[] args) {
		
		Time time1 = new Time("Grêmio");
		Time time2 = new Time("Flamengo");
		
		Jogador jogador1 = new Jogador("Neymar", time1);
		Jogador jogador2 = new Jogador("Pele", time2);
		Jogador jogador3 = new Jogador("Maradona");
		
				
		Jogador[] jogadores = new Jogador[] {jogador1, jogador2, jogador3};
		
		for(Jogador jogador: jogadores) {
			jogador.imprime();
		}
		
	}
}
