package parimpar;

import java.util.Scanner;

public class Parimpar {
	
	public static void main(String[] args) {
		
		
		
		Scanner x = new Scanner(System.in);
		System.out.println("Digite um n�mero");
		
		
		int y = x.nextInt();
		
		if(y % 2 == 0) {
			
			System.out.println("O n�mero � par");
			
		}
		else {
			System.out.println("O n�mero � �mpar");
		}
	}

}
