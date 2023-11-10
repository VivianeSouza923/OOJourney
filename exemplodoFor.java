package exercicios;

public class exemplodoFor {
	
	public static void main(String[] args) {
		//int j;
		
		/*for(j = 0; j < 10; j++) {
			System.out.println("é o " + j);
		}*/
		
		for(int i = 2, j = i + 5; i < 8; i++, j = i * 9) {
			System.out.println("i = " + i + " j = " + j);
		}
	}

}
