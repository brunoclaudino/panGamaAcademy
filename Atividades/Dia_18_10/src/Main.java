
public class Main {

	public static void main(String[] args) {
		Aluno aluno = new Aluno();
		aluno.setNome("Bruno");
		System.out.println("Aluno:"+aluno.getNome());
		System.out.println("M�dia:"+aluno.media());
		System.out.println("Situa��o:"+aluno.aprovado());
		System.out.println("Maior nota:"+aluno.maiorNota());

	}

}
