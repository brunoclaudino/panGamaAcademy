//Escreva um programa que verifique a validade de uma senha fornecida pelo usu�rio. A senha v�lida � o n�mero 1234.	Devem ser	impressas as seguintes	mensagens: ACESSO	PERMITIDO	
//caso	a	senha	seja	v�lida. ACESSO	NEGADO	caso	a	senha	seja	inv�lida.
import java.util.Scanner;
public class Senha {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite a senha:");
		int senha = scanner.nextInt();
		if(senha == 1234) {
			System.out.println("Acesso permitido");
		}else {
			System.out.println("Acesso negado");
		}
	}

}
