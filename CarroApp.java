package poo;

public class CarroApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Motor motor = new Motor("Diesel", 180);
		Motor motor0 = new Motor("Eletrico", 150);
		Carro amarok = new Carro("Amarok","verde", motor);
		Carro c2 = new Carro("Zoe", "cinza", motor0);
		amarok.ligar();
		c2.ligar();

	}

}
