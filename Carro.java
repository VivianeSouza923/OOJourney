package poo;

public class Carro {
	
	String marca;
	String cor;
	Motor motor;
	
	Carro(String marca, String cor, Motor motor){
		this.marca = marca;
		this.cor = cor;
		this.motor = motor;
	}
	
	//m�todo
	void ligar() {
		this.motor.darPartida();
	}

}
