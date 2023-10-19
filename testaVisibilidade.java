package dezessetedeoutubro;

public class testaVisibilidade {
	
	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		
		
		while(x < 100) {
			int z = 0;
			int y = x; // inválido: redefinição da variável y
			x++;
		}
	}

}
