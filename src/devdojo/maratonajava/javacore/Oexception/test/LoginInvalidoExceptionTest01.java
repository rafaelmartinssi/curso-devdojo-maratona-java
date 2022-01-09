package devdojo.maratonajava.javacore.Oexception.test;

import java.util.Scanner;

import devdojo.maratonajava.javacore.Oexception.domain.LoginInvalidoException;

public class LoginInvalidoExceptionTest01 {
	public static void main(String[] args) {
		try {
			logar();
		} catch (LoginInvalidoException e) {
			e.printStackTrace();
		}
	}
	
	private static void logar() throws LoginInvalidoException {
		try(Scanner scanner = new Scanner(System.in);){
			String username = "Goku";
			String senha = "ssj";
			
			System.out.println("Usuário: ");
			String usernameDigitado = scanner.nextLine();
			
			System.out.println("Senha: ");
			String senhaDigitada = scanner.nextLine();
			
			if(!username.equals(usernameDigitado) || !senha.equals(senhaDigitada)) {
				throw new LoginInvalidoException();
			}
			
			System.out.println("Usuário logado com sucesso");
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
