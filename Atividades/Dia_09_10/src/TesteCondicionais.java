import java.util.Scanner;
public class TesteCondicionais {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);;
		System.out.println("Digite sua idade");
		int idade = -1;
		while(idade <  0){
			idade = scanner.nextInt();
			if(idade < 0)
				System.err.println("Idade inv�lida, digite nova idade:");
		}
		if(idade>=18) {
			System.out.println("Voc� � maior de idade, pode entrar");
		}else {
			System.out.println("Voc� n�o � maior de idade");
			System.out.println("Quantas pessoas est�o nesse conjunto?");
			int pessoas = scanner.nextInt();
			if(pessoas>=3) {
				System.out.println("Pode entrar, voc� est� acompanhado!");
			}else {
				System.out.println("Voc� n�o pode entrar!");
			}
		}
		

	}

}
