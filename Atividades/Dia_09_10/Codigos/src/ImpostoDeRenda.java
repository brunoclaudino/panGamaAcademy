import java.util.Scanner;
public class ImpostoDeRenda {

	public static void main(String[] args) {
		Scanner scanne = new Scanner(System.in);
		System.out.println("Digite seu Sal�rio");
		double salario = Double.parseDouble(scanne.nextLine());
		if(salario<2500.0) {
			System.out.println("Sua al�quota � de 15%  \nVoc� pode descontar at� 350");
		}else if(salario>=2500.0 && salario<3800.0) {
			System.out.println("Sua al�quota � de 18%  \nVoc� pode descontar at� 500");
		}else {
			System.out.println("Sua al�quota � de 23%  \nVoc� pode descontar at� 630");
		}
	}
}
