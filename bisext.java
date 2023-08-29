package bissexto;

import java.util.Scanner;

public class bisext {
	
	public static void main(String[] args) {
		
		System.out.println("Digite um numero: ");
		Scanner y = new Scanner (System.in);
		
		int year = y.nextInt();
		
		
		String res = year % 4 == 0 & year % 100 != 0 || year % 400 == 0 ? "bisexto": "não bissexto";
		
		System.out.println(res);
		
		
		
		
		
	}
	

}
