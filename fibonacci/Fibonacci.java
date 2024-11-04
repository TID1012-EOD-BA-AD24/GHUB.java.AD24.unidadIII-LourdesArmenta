package fibonacci;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("introduce número Fibonacci a calcular:");
        int n= entrada.nextInt();
        System.out.println("Numero Fibonacci = "+fibonacci_iterativo(n));
        System.out.println("Número Fibonacci = "+fibonacci_recursivo(n));
        
    }
    public static long fibonacci_iterativo(int n){
        long ultimo=1;
        long penultimo=0;
        long fib=1;
        
        for (int i=2;i<=n;i++){
            fib = ultimo+penultimo;
            penultimo = ultimo;
            ultimo=fib;
            
        }
        return fib;


    }
    public static long fibonacci_recursivo(int n){
        if(n<=1)
           return n;
        else
           return fibonacci_recursivo(n-1)+fibonacci_recursivo(n-2);
    }
    
}
