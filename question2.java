//2. Crie um programa que calcule a soma dos nÃºmeros pares de 1 a 100 usando um loop `for`.

public class MyClass {
    public static void main(String args[]) {
    int soma = 0;
      for(int i=1; i<101; i++){
          
          if(i%2 == 0){
              soma = soma + i;
          }
          
      }
      System.out.println(soma);
    }
}