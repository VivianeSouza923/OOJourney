package dezessetedeoutubro;

public class Variavel {
	
	public static int c = 10;
	public int i;
	
	public int func() {
		
		int n = 5;
		c++;
		i = 2*n*c;
		int z = 0;
		if(i < 50) 
			z = 10;
	
		z *= 10;
		return (i+c);
	}

	}
