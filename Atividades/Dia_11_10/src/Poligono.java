import java.util.Scanner;
public class Poligono {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o n�mero de lados:");
		int lados = Integer.parseInt(scanner.nextLine());
		if(lados > 5) {
			System.out.println("POL�GONO N�O IDENTIFICADO");
		}else if(lados < 3) {
			System.out.println("N�O � UM POL�GONO");
		}else {
			System.out.println("� um pol�gono de "+ lados+ " lados");
		}

	}
}
