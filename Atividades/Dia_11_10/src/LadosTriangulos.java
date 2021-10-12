import java.util.Scanner;
public class LadosTriangulos {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite os 3 lados separados por um único espaço:");
		String[] lados = scanner.nextLine().split(" ");
		String resultado = "";
		if(Float.parseFloat(lados[0])== Float.parseFloat(lados[1])) {
			if (Float.parseFloat(lados[1]) == Float.parseFloat(lados[2])) {
				resultado = "Equilátero";
			}else {
				resultado = "Isóceles";
			}
		}else {
			resultado = "Escaleno";
		}
		System.out.println("Triangulo do tipo: "+resultado);

	}
}
