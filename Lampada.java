package coisasdalampada;

public class Lampada {
	
	// atributos
	double potencia;
	String marca;
	
	 //m�todos
	 void ligar() {
		System.out.println("L�mpada " + marca + " ligada");
	}
	
	 void desligar() {
		System.out.println("L�mpada " + marca + " desligada");

		
	}
	
	/*	ISSO N�O � POO
	 * public static void main(String[] args) {
		ligar();
		desligar();
	}*/
	
	public static void main(String[] args) {
		Lampada l1 = new /* new � palavra reservada para criar um objeto*/ Lampada();
		Lampada l2 = new Lampada(); // criado objeto2 
		
		l1.potencia = 10.0;
		l1.marca = "Elgin";
		l2.potencia = 20.0;
		l2.marca = "Positivo";
		l1.ligar();
		l2.desligar();
		
	}

}
