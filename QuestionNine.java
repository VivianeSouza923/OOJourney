package tabuada;
import java.util.Scanner;

public class QuestionNine {
	
	


	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite o preço do produto: ");
	        double precoProduto = scanner.nextDouble();

	        System.out.print("Digite a quantidade comprada: ");
	        int quantidadeComprada = scanner.nextInt();

	        double precoTotal;

	        if (quantidadeComprada > 10) {
	            // Aplica um desconto de 10% se a quantidade comprada for maior que 10 unidades
	            double desconto = 0.10 * precoProduto * quantidadeComprada;
	            precoTotal = precoProduto * quantidadeComprada - desconto;
	        } else {
	            precoTotal = precoProduto * quantidadeComprada;
	        }

	        System.out.println("O preço total a ser pago é: R$" + precoTotal);
	    
	}


}
