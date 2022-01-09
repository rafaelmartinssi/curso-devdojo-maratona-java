package devdojo.maratonajava.javacore.ZZIjdbc.test;

import devdojo.maratonajava.javacore.ZZIjdbc.domain.Producer;
import devdojo.maratonajava.javacore.ZZIjdbc.repository.ProducerRepository;

public class TestConnection {
	public static void main(String[] args) {
		Producer producer = new Producer.Builder().name("Rafael").build();
		ProducerRepository.save(producer);
	}
}
