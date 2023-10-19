package dezessetedeoutubro;

public class TestaConversoes {
	
	static public void main(String[] args) {
		char c = 'a';
		System.out.println("c: " + c);
		int i = c; // conversão explícita desnecessária
		System.out.println("i: " + i);
		float f = c; // conversão explícita desnecessária
		System.out.println("f: " + f);
		int j = 101;
		System.out.println("j: " + j);
		char d = (char)j; // conversão explícita obrigatória
		System.out.println("d: " + d);
		boolean b = true;
		int k = (int)b; // erro: os tipos são incompatíveis
		}

}
