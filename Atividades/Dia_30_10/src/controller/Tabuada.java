package controller;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		boolean terminou = false;
		Scanner entrada = new Scanner(System.in);
		while(!terminou) {
			System.out.println("Digite um número de 1 a 10 para imprimir a tabuada");
			try {
				int numero = entrada.nextInt();
				if(numero < 0 && numero >10) {
					System.err.println("Valor_Inválido");
					System.out.println("==================================================");
					throw new IllegalArgumentException("Only Positive Numbers & no Letters Please!");
				}
				System.out.println("Valor escolhido:"+numero);
				System.out.println("Digite até qual valor deseja realizar a tabuada ");
				try {
					int vezes = entrada.nextInt();
					if(vezes < 0) {
						System.err.println("Valor_Inválido");
						System.out.println("==================================================");
						throw new IllegalArgumentException("Only Positive Numbers & no Letters Please!");
					}
					System.out.println("==================================================");
					for(int i = 0; i <= vezes; i++) {
						System.out.println(numero+" x "+i+" = "+ numero*i);
					}
					System.out.println("==================================================");
				}catch(InputMismatchException e) {
					System.err.println("Erro_entrada: "+e.toString());
					break;
				}
			}catch(InputMismatchException e) {
				System.err.println("Erro_entrada: "+e.toString());
				break;
			}
		}

	}

}
