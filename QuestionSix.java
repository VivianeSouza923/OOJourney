package tabuada;
import java.util.Scanner;

public class QuestionSix {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Escolha uma operação matemática:");
	        System.out.println("1. Adição");
	        System.out.println("2. Subtração");
	        System.out.println("3. Multiplicação");
	        System.out.println("4. Divisão");
	        
	        int escolha = scanner.nextInt();

	        System.out.print("Digite o primeiro número: ");
	        double numero1 = scanner.nextDouble();

	        System.out.print("Digite o segundo número: ");
	        double numero2 = scanner.nextDouble();

	        double resultado = 0;

	        switch (escolha) {
	            case 1:
	                resultado = numero1 + numero2;
	                break;
	            case 2:
	                resultado = numero1 - numero2;
	                break;
	            case 3:
	                resultado = numero1 * numero2;
	                break;
	            case 4:
	                if (numero2 != 0) {
	                    resultado = numero1 / numero2;
	                } else {
	                    System.out.println("Erro: Divisão por zero!");
	                    System.exit(1); // Encerra o programa com código de erro 1
	                }
	                break;
	            default:
	                System.out.println("Operação inválida!");
	                System.exit(1); // Encerra o programa com código de erro 1
	        }

	        System.out.println("O resultado da operação é: " + resultado);
	    }
	}


