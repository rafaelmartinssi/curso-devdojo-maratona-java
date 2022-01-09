package devdojo.maratonajava.javacore.Oexception.domain;

//exemplo de exception customizada.
public class LoginInvalidoException extends Exception{

	private static final long serialVersionUID = 1L;

	public LoginInvalidoException() {
		super("Login invalido!");
	}
	
	public LoginInvalidoException(String message) {
		super(message);
	}
}
