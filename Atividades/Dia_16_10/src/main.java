
public class main {

	public static void main(String[] args) {
		Leao leao = new Leao();
		Pato pato = new Pato();
		
		System.out.println("A espécie desse animal é:"+leao.especie);
		if(leao.pelagem) {
			System.out.println("Ele tem pelagem");
		}
		System.out.println(leao.comunicar());
		System.out.println(leao.movimentar());
		
		System.out.println("\nA espécie desse animal é:"+pato.especie);
		if(pato.plumagem) {
			System.out.println("Ele tem plumas");
		}
		
		/*
		 * Note que eu não implementei na classe 'Pato' o método 'comunicar' como na classe 'Leao'
		 * então, o método comunicar executa como em sua função original implementada em 'Animal'
		 * que é printar 'Sem informações'!
		 * */
		System.out.println(pato.comunicar());                         
		System.out.println(pato.movimentar());

	}

}
