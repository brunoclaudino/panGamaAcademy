import java.util.Scanner;
public class TesteCondicionais {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);;
		System.out.println("Digite sua idade");
		int idade = -1;
		while(idade <  0){
			idade = scanner.nextInt();
			if(idade < 0)
				System.err.println("Idade inválida, digite nova idade:");
		}
		if(idade>=18) {
			System.out.println("Você é maior de idade, pode entrar");
		}else {
			System.out.println("Você não é maior de idade");
			System.out.println("Quantas pessoas estão nesse conjunto?");
			int pessoas = scanner.nextInt();
			if(pessoas>=3) {
				System.out.println("Pode entrar, você está acompanhado!");
			}else {
				System.out.println("Você não pode entrar!");
			}
		}
		

	}

}
