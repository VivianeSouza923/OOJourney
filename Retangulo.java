package provaOO;

//Classe derivada Retangulo
class Retangulo extends Forma implements Desenhavel{
 private double comprimento;
 private double largura;

 public Retangulo(double comprimento, double largura) {
     super("Retângulo");
     this.comprimento = comprimento;
     this.largura = largura;
 }

	 @Override
	 public double calcularArea() {
	     return comprimento * largura;
	 }
 
	 @Override
	 public double calcularPerimetro() {
	     return 2 * (comprimento + largura);
	 }
	 
	 // vem da INterface
	 @Override
	    public void desenhar() {
	        System.out.println("Desenhando um retângulo de comprimento " + comprimento + " e largura " + largura);
	    }
 
 
}