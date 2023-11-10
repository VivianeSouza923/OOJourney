package exercicios;

public class Arrayzinha {
	
	public static void main(String[] args) {
		int[] idades = new int[10];
		for (int i = 0; i < 10; i++) {
			idades[i] =  i * 10;
		}
		
		for(int i = 0; i < 10; i++) {
			System.out.println(idades[i]);
		}
	}

}
