import java.util.Scanner;
public class PodeVotar {

	public static void main(String[] args) {
		int ano = 2004, anoAtual = 2021;
		boolean titulo = false;
		System.out.println("Digite o seu ano de nascimento");
		Scanner scanner = new Scanner(System.in);
		ano = Integer.parseInt(scanner.nextLine());
		if(anoAtual-ano >= 16 && anoAtual-ano < 18) {
			System.out.println("Voc� possui t�tulo? Digite 1 para sim e 0 para n�o");
			String aux = scanner.nextLine();
			if (aux == "1"){
				titulo = true;
			}
			if(titulo == true) {
				System.out.println("Voc� poder� votar nessas elei��es");
			}else {
				System.out.println("Voc� n�o poder� votar nessas elei��es");
			}
		}
		if((anoAtual-ano) >=18) {
			System.out.println("Voc� poder� votar nessas elei��es");
		}else {
			System.out.println("Voc� n�o poder� votar nessas elei��es");
		}

	}

}
