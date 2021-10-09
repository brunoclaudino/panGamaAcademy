import java.util.Scanner;
public class PodeVotar {

	public static void main(String[] args) {
		int ano = 2004, anoAtual = 2021;
		boolean titulo = false;
		System.out.println("Digite o seu ano de nascimento");
		Scanner scanner = new Scanner(System.in);
		ano = Integer.parseInt(scanner.nextLine());
		if(anoAtual-ano >= 16 && anoAtual-ano < 18) {
			System.out.println("Você possui título? Digite 1 para sim e 0 para não");
			String aux = scanner.nextLine();
			if (aux == "1"){
				titulo = true;
			}
			if(titulo == true) {
				System.out.println("Você poderá votar nessas eleições");
			}else {
				System.out.println("Você não poderá votar nessas eleições");
			}
		}
		if((anoAtual-ano) >=18) {
			System.out.println("Você poderá votar nessas eleições");
		}else {
			System.out.println("Você não poderá votar nessas eleições");
		}

	}

}
