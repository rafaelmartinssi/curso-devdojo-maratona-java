package devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.domain;

import java.util.HashSet;
import java.util.Set;

public final class Aircraft {
	
	private static final Aircraft INSTANCE = new Aircraft();
	
	Set<String> availabreSeats = new HashSet<String>();
	
	{
		availabreSeats.add("A1");
		availabreSeats.add("A2");
	}
	
	public boolean bookSeat(String seat) {
		return availabreSeats.remove(seat);
	}
	
	public static Aircraft getINSTANCE() {
		return INSTANCE;
	}
}
