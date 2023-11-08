package provaOO;

//Classe base Forma
abstract class Forma {
 protected String tipo;

 public Forma(String tipo) {
     this.tipo = tipo;
 }

 /*public void desenhar() {
     System.out.println("Desenhando uma forma " + tipo);
 }*/
 
 // Método para calcular a área (pode ser sobrescrito nas classes derivadas)
 /*public double calcularArea() {
     return 0.0; // Valor padrão para formas indefinidas
 }*/
 
 // Método abstrato para calcular a área (deve ser implementado nas classes derivadas)
 public abstract double calcularArea();

 // Método abstrato para calcular o perímetro (deve ser implementado nas classes derivadas)
 public abstract double calcularPerimetro();
 
}






