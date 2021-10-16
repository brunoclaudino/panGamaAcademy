
public class Contagem {

	public static void main(String[] args) {
		int numero = 233;
		while(numero < 456){
			System.out.println(numero);
			if(numero >= 300 && numero <= 400) {
				numero += 3;
			}else{
				numero += 5;
			}
		}
	}

}
