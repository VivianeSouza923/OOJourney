// 5. Crie um programa que calcule a sequÃªncia de Fibonacci atÃ© um nÃºmero especÃ­fico fornecido pelo usuÃ¡rio usando um loop `while`.

package tabuada;

public class QuestionFive {
	
	  static long fibo(int n) {
	        if (n < 2) {
	            return n;
	        } else {
	            return fibo(n - 1) + fibo(n - 2);
	        }
	    }

	    public static void main(String[] args) {

		// teste do programa. Imprime os 10 primeiros termos
		for (int i = 0; i < 10; i++) {
	            System.out.print("(" + i + "):" + QuestionFive.fibo(i) + "\n");
	        }

	    }

}
