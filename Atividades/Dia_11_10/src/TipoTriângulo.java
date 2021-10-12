// Escreva um programa que leia o valor de 3 �ngulos de um tri�ngulo e escreva se o tri�ngulo � Acut�ngulo, Ret�ngulo ou Obtus�ngulo

import java.util.Scanner;
public class TipoTri�ngulo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite os 3 �ngulos separados por um �nico espa�o:");
		String[] angulos = scanner.nextLine().split(" ");
		String resultado = "";
		for(String i : angulos) {
			if(Float.parseFloat(i) == 90.0) {
				resultado = "Tri�ngulo Ret�ngulo!";
				break;
			}else if(Float.parseFloat(i) >= 90.0){
				resultado = "Tri�ngulo Obtus�ngulo!";
				break;
			}else {
				resultado = "Tri�ngulo Acut�ngulo";
			}
		}
		System.out.println(resultado);

	}

}
