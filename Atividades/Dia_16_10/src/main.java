
public class main {

	public static void main(String[] args) {
		Leao leao = new Leao();
		Pato pato = new Pato();
		
		System.out.println("A esp�cie desse animal �:"+leao.especie);
		if(leao.pelagem) {
			System.out.println("Ele tem pelagem");
		}
		System.out.println(leao.comunicar());
		System.out.println(leao.movimentar());
		
		System.out.println("\nA esp�cie desse animal �:"+pato.especie);
		if(pato.plumagem) {
			System.out.println("Ele tem plumas");
		}
		
		/*
		 * Note que eu n�o implementei na classe 'Pato' o m�todo 'comunicar' como na classe 'Leao'
		 * ent�o, o m�todo comunicar executa como em sua fun��o original implementada em 'Animal'
		 * que � printar 'Sem informa��es'!
		 * */
		System.out.println(pato.comunicar());                         
		System.out.println(pato.movimentar());

	}

}
