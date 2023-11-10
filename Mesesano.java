package exercicios;

public class Mesesano {
	
	int i, j;
	
	String meses_ano [] = {
			"Janeiro", 
			"Fevereiro", 
			"Março", 
			"Abril", 
			"Maio", 
			"Junho",
			"Agosto",
			"Setembro",
			"Outubro",
			"Novembro",
			"Dezembro"
			};
	
    // Método para imprimir os elementos do array
	public void imprimir() {
		for(String mes : meses_ano) {
			System.out.println(mes);
		}
	}
	
	public static void main(String args[]) {
		// criando um objeto da classe Mesesano
		Mesesano exemplo = new Mesesano();
		
		// chamar o método para impressão 
		exemplo.imprimir();
	}
	

	
}
