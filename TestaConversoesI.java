package dezessetedeoutubro;

public class TestaConversoesI {
	
	static public void main(String[] args) {
		double x = 9.997;
		int i = (int)x;
		System.out.println("i: " + i);
		i = (int)Math.round(x);
		System.out.println("i: " + i);
		
	}

}
