package Trabalho;

public class Teste {

	public static void main(String[] args) {
		
		Gerente g1 = new Gerente();
		
		Gerente g2 = new Gerente("Golsty");
		
		Gerente g3 = new Gerente("Golsty","5075664");
		
		System.out.println(g2.getNome());
		System.out.println(g3.getNome()+" "+g3.getSenha());	
		
	}
}
