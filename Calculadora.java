package provaOO;

public class Calculadora {
    // Método sobrecarregado para somar dois inteiros
    public int somar(int a, int b) {
        return a + b;
    }

    // Método sobrecarregado para somar dois números de ponto flutuante (double)
    public double somar(double a, double b) {
        return a + b;
    }

    // Método sobrecarregado para multiplicar dois inteiros
    public int multiplicar(int a, int b) {
        return a * b;
    }

    // Método sobrecarregado para multiplicar dois números de ponto flutuante (double)
    public double multiplicar(double a, double b) {
        return a * b;
    }

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        int resultadoSomaInt = calculadora.somar(5, 3);
        double resultadoSomaDouble = calculadora.somar(5.5, 3.3);

        int resultadoMultiplicacaoInt = calculadora.multiplicar(4, 2);
        double resultadoMultiplicacaoDouble = calculadora.multiplicar(4.5, 2.2);

        System.out.println("Soma de inteiros: " + resultadoSomaInt);
        System.out.println("Soma de números de ponto flutuante: " + resultadoSomaDouble);
        System.out.println("Multiplicação de inteiros: " + resultadoMultiplicacaoInt);
        System.out.println("Multiplicação de números de ponto flutuante: " + resultadoMultiplicacaoDouble);
    }
}
