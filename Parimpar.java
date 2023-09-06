package parimpar;

import java.util.Scanner;

public class Parimpar {
	
	public static void main(String[] args) {
		
		
		
		Scanner x = new Scanner(System.in);
		System.out.println("Digite um número");
		
		
		int y = x.nextInt();
		
		if(y % 2 == 0) {
			
			System.out.println("O número é par");
			
		}
		else {
			System.out.println("O número é ímpar");
		}
	}

}
