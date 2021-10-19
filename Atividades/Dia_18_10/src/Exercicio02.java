//Dado o seguinte array:  int[] array2 = {13, 22, 35, 45, 54, 56, 12, 11, 27, 34, 89, 101,
//125};
//A. Retorne somente com números pares
//B. Retorne somente com os números ímpares * 2.
public class Exercicio02 {

	public static void main(String[] args) {
		int[] array2 = {13, 22, 35, 45, 54, 56, 12, 11, 27, 34, 89, 101,125};
		String par = "", impar = "";
		for(int i : array2) {
			if(i%2 == 0) {
				par += " " + Integer.toString(i);
			}else {
				int temp = 2*i;
				impar += " " + Integer.toString(temp);
			}
		}
		System.out.println("Sequência de Pares:"+par);
		System.out.println("Sequência de Ímpares x 2:"+impar);
	}

}
