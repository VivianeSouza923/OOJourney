package helloworld;

public class testeInvalido {
	
	
		
		public static void main(String[] args) {
			int boolInt = 1;
			boolean bool = true;
			
			if(bool) System.out.println(bool);
			
			if(boolInt) { // aqui dá erro
				System.out.println("Olá, Mundo");
			}
			
			while(boolInt = 5) {
				System.out.println("Isto é um teste");
			}
		}

	


}
