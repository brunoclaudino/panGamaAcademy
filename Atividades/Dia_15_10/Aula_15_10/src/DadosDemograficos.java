import java.util.LinkedList;

public class DadosDemograficos {

	public static void main(String[] args) {
		LinkedList<Habitantes> habitantes = new LinkedList<Habitantes>();
		
		for(int i = 0; i < 20; i++) {
			Habitantes temp = new Habitantes((i*58.94), i);
			habitantes.add(temp);
		}
		
		double mediaSal=0;
		double mediaFilhos=0;
		double maxSal=0;
		double pessoasMais100=0;
		
		for(Habitantes i: habitantes) {
			mediaSal += i.salario;
			mediaFilhos +=i.filhos;
			if(i.salario > maxSal) {
				maxSal = i.salario;
			}
			if(i.salario > 100) {
				pessoasMais100 +=1;
			}
		}
		mediaSal = mediaSal/habitantes.size();
		mediaFilhos = mediaFilhos/habitantes.size();
		pessoasMais100 = (pessoasMais100/habitantes.size())*100;
		System.out.println("O salário médio é de: R$"+ mediaSal);
		System.out.println("A média de filhos é de:"+ mediaFilhos);
		System.out.println("O salário mais alto é de: R$"+ maxSal);
		System.out.println("A cidade tem "+pessoasMais100+"% de pessoas ganhando mais de R$100");
	}

}
