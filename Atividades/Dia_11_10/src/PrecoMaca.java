import java.util.Scanner;
//As ma��s custam R$ 0,30 cada se forem compradas menos do que uma d�zia, e R$ 0,25 se forem compradas pelo menos doze.
//Escreva um programa que leia o n�mero de ma��s compradas, calcule e escreva o valor total da compra
public class PrecoMaca {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite a quantidade de ma�as que deseja comprar:");
		int quantidade = Integer.parseInt(scanner.nextLine());
		double preco = 0.0;
		if(quantidade >= 12) {
			preco = (quantidade * 0.25);
		}else {
			preco = (quantidade * 0.3);
		}
		System.out.printf("O pre�o ser�:R$ %.2f ",  preco);
	}

}
