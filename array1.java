/*  características de uma array:
 * 	
 * 	1. homogênea;
 * 	2. fixa;
 * 	3. indexada 
 */

package array;

import java.util.Arrays;

public class array1 {
	
		public static void main(String[] args) {
			
			String[] nomes = new String[5];
			nomes[0] = "Antonio";
			nomes[1] = "Maria";
			nomes[2] = "Pedro";
			nomes[3] = "Paulo";
			nomes[4] = "Silvia";
			// aqui vai atualizar o nomes[4]
			nomes[4] = "Rosa";
			
			System.out.println(Arrays.toString(nomes));
			
			
			for(int i = 0; i <= 4; i++) {
				
				System.out.println(nomes[i]);
			}
			
			System.out.println("");
			
			
			for(int i = 4; i >= 0; i--) {
				
				System.out.println(nomes[i]);

				
				
			}
			
			System.out.println("");
			
			
			for(int i = 1; i < 11; i++) {
				
				System.out.println(i);

				
				
			}
			
			System.out.println("");
			
			for(int i = 10; i >= 0; i--) {
				
				System.out.println(i);

				
				
			}
			
			
			System.out.println("");
			
			
			for(int i = 10; i <= 100; i=i+10 ) {
				
				System.out.println(i);
			}
			
			System.out.println("");
			
			int [] numeros = new int [10];
			for(int x = 1; x < 11; x++) {
				
				numeros[x-1] = x*10;
			}
			
			
			System.out.println(Arrays.toString(numeros));
			
			
			
			
			
		}
		
		

}
