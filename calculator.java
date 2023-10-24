
// ver get e set em java 
package aula2410;

public class calculator {
	
	


	double somar(double x, double y, double z){
		
		return x+y+z;
	}
	
	
	double somar(double x, double y){
		
		return x+y;
		
	}
	
	double subtrair(double x, double y, double z){
		
		return x-y-z;
		
	}


	double subtrair(double x, double y){
	
	return x-y;
	
	}
	
	
	
	public static void main(String[] args) {
		
		calculator calculo1 = new calculator();
		
		double a = calculo1.somar(2, 1, 3);
		
		System.out.println(a);
		
		calculator calculo2 = new calculator();
		
		
		double b = calculo2.somar(2, 1);
		
		System.out.println(b);
		
		calculator calculo3 = new calculator();
		
		
		double c = calculo3.subtrair(2, 1, 3);
		
		System.out.println(c);
		
		calculator calculo4 = new calculator();
		double d = calculo4.subtrair(2, 1);
		
		System.out.println(d);
		
		
	}
	

}
