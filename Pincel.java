package aula1010;
//cria classe
public class Pincel {
	
	//cria atributos
	String cor;
	String marca;
	// essa variável n pertence a um objeto, pertence a classe.
	static int quantidadeDePinceis = 0; // é como se fosse uma variável global. é compartilhada por todos os objetos (isso que criar uma variável static faz)
	
	
	//cria métodos
	void escrever() {
		System.out.println("escrevendo na cor " + cor + " da marca " + marca);
	}
	
	static void apagar() {
		
		System.out.println("Apagando...");
		
	}
	
	// construtor: cria o objeto e o inicializa. O construtor não tem tipo de retorno. Em java, construtor tem o mesmo nome da classe.
	// java fornece construtor default(n inicializa, apenas cria o objeto) se você n criar um.
	Pincel(String color){
		cor = color;
	}
	
	Pincel(String color, String brand){
		cor = color;
		marca = brand;
	}
	
	public static void main(String[] args) {
		
		// criando/estanciando um objeto
		Pincel p1 = new Pincel("Azul", "Pilot");
		// usa objetos
		//p1.cor = "Azul";
		p1.escrever();
		p1.quantidadeDePinceis++;
		
		// criando/estanciando um objeto
				Pincel p2 = new Pincel("Vermelha");
				p2.marca =  "PRW";
				p2.quantidadeDePinceis++;
				// usa objetos
				//p2.cor = "Vermelha";
				p2.escrever();
				
				System.out.println(p1.quantidadeDePinceis);
				p1.escrever();
				Pincel.apagar();
	}

}
