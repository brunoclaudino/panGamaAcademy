//Dado o seguinte array: int[] array = { 87, 68, 94, 100, 83, 78, 85, 91, 76, 87 };
//A. Retorno o valor total da soma de todos os elementos com foreach
//B. Retorne a m�dia de todos os elementos
//C. Retorne o maior valor e o menor elemento
public class Exercicio01 {

	public static void main(String[] args) {
		int[] array = { 87, 68, 94, 100, 83, 78, 85, 91, 76, 87 };
		int total = 0, maior = 0, menor = array[0];
		for(int i : array) {
			total += i;
			if(i > maior) {
				maior = i;
			}
			if(i < menor){
				System.out.println("� menor");
				menor = i;
			}
		}
		System.out.println("O somat�rio dos elementos �:"+total);
		System.out.println("A m�dia dos elementos �:"+ (double)total/array.length);
		System.out.println("O maior elemento �:"+maior +" e o menor elemento �:"+menor);
		
	}

}
