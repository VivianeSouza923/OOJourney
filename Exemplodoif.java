package exercicios;

public class Exemplodoif {
	
	public static void main(String[] args) {
		if(args.length > 0) {
			for(int j = 0; j < Integer.parseInt(args[0]); j++) {
				System.out.println("é " + j + ".");
			}
			
			System.out.println("Fim da contagem.");
		}
		
		System.out.println("Fim do programa.");
	}

}
