package devdojo.maratonajava.javacore.Kenum.test;

import devdojo.maratonajava.javacore.Kenum.domain.Cliente;
import devdojo.maratonajava.javacore.Kenum.domain.TipoCliente;
import devdojo.maratonajava.javacore.Kenum.domain.TipoPagamento;

public class ClienteTest01 {	
	public static void main(String[] args) {
		Cliente cliente = new Cliente("Rafael", TipoCliente.PESSOA_FISICA, TipoPagamento.CREDITO);
		System.out.println(cliente.toString());
	}
}
