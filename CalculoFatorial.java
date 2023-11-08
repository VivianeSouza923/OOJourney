package provaOO;

public class CalculoFatorial {
    // Função recursiva para calcular o fatorial de um número
    public static long calcularFatorial(int n) {
        if (n == 0) {
            return 1; // O fatorial de 0 é 1
        } else {
            return n * calcularFatorial(n - 1);
        }
    }

    public static void main(String[] args) {
        int numero = 5; // Substitua pelo número desejado

        long fatorial = calcularFatorial(numero);

        System.out.println("O fatorial de " + numero + " é " + fatorial);
    }
}
