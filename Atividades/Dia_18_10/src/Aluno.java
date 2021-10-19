
public class Aluno {
	private String nome;
	private double[] notas = {10, 5.0, 7.0, 9.0, 10.0};
	
	public String aprovado() {
		double media = media();
		if(media >= 7) {
			return "Aprovado";
		}else if(media >= 5){
			return "Prova Final";
		}else{
			return "REPROVADO DIRETO";
		}
	}
	
	public double media(){
		double total=0;
		for(double d : notas) {
			total += d;
		}
		return total/notas.length;
	}
	
	public double maiorNota(){
		double maior = 0;
		for(double d : notas) {
			if(d > maior) {
				maior = d;
			}
		}
		return maior;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double[] getNotas() {
		return notas;
	}
	public void setNotas(double[] notas) {
		this.notas = notas;
	}
	
}
