package aula1010;

public class Pessoa {
	
	String nome;
	int RG;
	
	
	void ver() {
		System.out.println("Pessoa de nome: " + nome + " e RG: " + RG);
	}
	
	
	Pessoa(String nome){
		
		this.nome = nome;
		
		
	}
	
	

	Pessoa(String nome, int RG){
		
		this.nome = nome;
		this.RG = RG;
		
		
	}
	
	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa("Vivi");
		p1.RG = 12345;
		p1.ver();
		
		
		
		Pessoa p2 = new Pessoa("Thorin", 1234);
		p2.ver();
	}
	

}
