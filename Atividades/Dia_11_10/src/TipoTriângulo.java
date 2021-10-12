// Escreva um programa que leia o valor de 3 ângulos de um triângulo e escreva se o triângulo é Acutângulo, Retângulo ou Obtusângulo

import java.util.Scanner;
public class TipoTriângulo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite os 3 ângulos separados por um único espaço:");
		String[] angulos = scanner.nextLine().split(" ");
		String resultado = "";
		for(String i : angulos) {
			if(Float.parseFloat(i) == 90.0) {
				resultado = "Triângulo Retângulo!";
				break;
			}else if(Float.parseFloat(i) >= 90.0){
				resultado = "Triângulo Obtusângulo!";
				break;
			}else {
				resultado = "Triângulo Acutângulo";
			}
		}
		System.out.println(resultado);

	}

}
