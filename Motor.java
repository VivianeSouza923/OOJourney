package poo;

public class Motor {
	
	String tipo;
	int potencia;
	
	Motor(String tipo, int potencia){
		this.tipo = tipo;
		this.potencia = potencia;
		
	}
	void darPartida() {
		System.out.println("Vruuuum...");
	}

}
