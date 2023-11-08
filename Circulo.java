package provaOO;

//Classe derivada Circulo
class Circulo extends Forma implements Desenhavel{
 private double raio;

 public Circulo(double raio) {
     super("Círculo");
     this.raio = raio;
 }
 @Override
 public double calcularArea() {
     return Math.PI * raio * raio;
 }
 
 @Override
 public double calcularPerimetro() {
     return 2 * Math.PI * raio;
 }
 
 // vem da interface 
 @Override
 public void desenhar() {
     System.out.println("Desenhando um círculo de raio " + raio);
 }
 
 
}