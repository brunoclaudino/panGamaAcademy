// Faça um programa que pede duas notas de um aluno. Em seguida ele deve calcular a média do aluno e dar o seguinte resultado:
//  A mensagem "Aprovado", se a média alcançada for maior ou igual a sete;
//  A mensagem "Reprovado", se a média for menor do que sete;
//  A mensagem "Aprovado com Distinção", se a média for igual a dez.
import java.util.Scanner;

public class Notas {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		float n1, n2;
		System.out.println("Digite a primeira nota");
		n1 = Float.parseFloat(scanner.nextLine());
		System.out.println("Digite a segunda nota");
		n2 = Float.parseFloat(scanner.nextLine());
		float media  = (n1+n2)/2;
		if(media == 10) {
			System.out.println("Aprovado com Distinção, sua média foi: "+ media);
		}else if (media >= 7) {
			System.out.println("Aprovado, sua média foi: "+ media);
		}else {
			System.out.println("Reprovado, sua média foi: "+ media);
		}
	}

}
