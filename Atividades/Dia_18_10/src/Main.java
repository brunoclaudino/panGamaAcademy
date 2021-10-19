
public class Main {

	public static void main(String[] args) {
		Aluno aluno = new Aluno();
		aluno.setNome("Bruno");
		System.out.println("Aluno:"+aluno.getNome());
		System.out.println("Média:"+aluno.media());
		System.out.println("Situação:"+aluno.aprovado());
		System.out.println("Maior nota:"+aluno.maiorNota());

	}

}
