import java.util.Scanner;
public class ImpostoDeRenda {

	public static void main(String[] args) {
		Scanner scanne = new Scanner(System.in);
		System.out.println("Digite seu Salário");
		double salario = Double.parseDouble(scanne.nextLine());
		if(salario<2500.0) {
			System.out.println("Sua alíquota é de 15%  \nVocê pode descontar até 350");
		}else if(salario>=2500.0 && salario<3800.0) {
			System.out.println("Sua alíquota é de 18%  \nVocê pode descontar até 500");
		}else {
			System.out.println("Sua alíquota é de 23%  \nVocê pode descontar até 630");
		}
	}
}
