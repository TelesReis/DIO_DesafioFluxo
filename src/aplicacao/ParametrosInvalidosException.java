package aplicacao;

public class ParametrosInvalidosException extends Exception{
	static void mensagem() {
		System.out.println("O segundo par�metro deve ser maior que o primeiro");
	}
}
