package tabuada;
import java.util.Scanner;


public class QuestionTen {
	
	
	

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite o primeiro número: ");
	        double numero1 = scanner.nextDouble();

	        System.out.print("Digite o segundo número: ");
	        double numero2 = scanner.nextDouble();

	        System.out.print("Digite o terceiro número: ");
	        double numero3 = scanner.nextDouble();

	        double maiorNumero;

	        if (numero1 >= numero2 && numero1 >= numero3) {
	            maiorNumero = numero1;
	        } else if (numero2 >= numero1 && numero2 >= numero3) {
	            maiorNumero = numero2;
	        } else {
	            maiorNumero = numero3;
	        }

	        System.out.println("O maior número é: " + maiorNumero);
	    
	}


}
