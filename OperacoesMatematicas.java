package provaOO;

public class OperacoesMatematicas {
    // Método estático para realizar a soma
    public static int somar(int a, int b) {
        return a + b;
    }

    // Método estático para realizar a subtração
    public static int subtrair(int a, int b) {
        return a - b;
    }

    // Método estático para realizar a multiplicação
    public static int multiplicar(int a, int b) {
        return a * b;
    }

    // Método estático para realizar a divisão
    public static double dividir(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.err.println("Erro: Divisão por zero!");
            return Double.NaN; // Retorna NaN em caso de divisão por zero
        }
    }

    public static void main(String[] args) {
        // Exemplos de uso dos métodos estáticos
        int resultadoSoma = OperacoesMatematicas.somar(5, 3);
        int resultadoSubtracao = OperacoesMatematicas.subtrair(10, 4);
        int resultadoMultiplicacao = OperacoesMatematicas.multiplicar(6, 7);
        double resultadoDivisao = OperacoesMatematicas.dividir(9.0, 3.0);

        System.out.println("Soma: " + resultadoSoma);
        System.out.println("Subtração: " + resultadoSubtracao);
        System.out.println("Multiplicação: " + resultadoMultiplicacao);
        System.out.println("Divisão: " + resultadoDivisao);
    }
}
