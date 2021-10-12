import java.util.Scanner;
public class Poligono {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o número de lados:");
		int lados = Integer.parseInt(scanner.nextLine());
		if(lados > 5) {
			System.out.println("POLÍGONO NÃO IDENTIFICADO");
		}else if(lados < 3) {
			System.out.println("NÃO É UM POLÍGONO");
		}else {
			System.out.println("É um polígono de "+ lados+ " lados");
		}

	}
}
