package coisasdalampada;
// pessoa que come e dorme e que tem idade e nome
public class Pessoa {
	
	int idade;
	String nome;
	
	void comer() {
		System.out.println(nome + " de idade " + idade + " comeu");
	}
	
	void dormir() {
		System.out.println(nome + " de idade " + idade + " dormiu");
	}
	
	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa();
		Pessoa pessoa2 = new Pessoa();
		
		pessoa1.idade = 17;
		pessoa1.nome = "Joao";
		pessoa1.comer();
		pessoa1.dormir();
		
		
		pessoa2.idade = 29;
		pessoa2.nome = "Julio";
		pessoa2.comer();
		pessoa2.dormir();
	}

}
