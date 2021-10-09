// Faça um programa que receba três inteiros e diga qual deles é o maior e qual o menor. Conseguem criar mais de uma solução?
import java.util.Scanner;
import java.util.LinkedList;
public class ComparadorDeInteiros {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite os 3 números separados por um espaço");
		String linha = scanner.nextLine();
		String[] numeros = linha.split(" ");
		LinkedList<Integer> ns = new LinkedList<Integer>();
		ns.add(Integer.parseInt(numeros[0]));
		ns.add(Integer.parseInt(numeros[1]));
		ns.add(Integer.parseInt(numeros[2]));
		ns.sort(null);
		System.out.println("O menor é: "+ ns.getFirst());
		System.out.println("O maior é: "+ ns.getLast());
		
	}

}
