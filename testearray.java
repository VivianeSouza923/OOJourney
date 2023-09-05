package testearray;

public class testearray {
	
	public static void main(String[] args) {
		
		String[] meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
		int[] numeros = new int[100];
		numeros[0] = 10;
		meses[1]= "ehheeheheh";
		
		System.out.println(numeros[0]);
		System.out.println(meses[1]);
		
		for (String mes : meses) {
			System.out.println(mes);
		}
		
		String[][] turmas = {{"Maria", "José"}, {"Carlos", "Maurício"}, {"Joana", "Pedro"}};
		System.out.println(turmas[1][0]);
		System.out.println(turmas[2][0]);
	}
}