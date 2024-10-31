package factorial;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("introduce número entero:");
        int num=entrada.nextInt();
        System.out.println("Factorial de "+num+"!= "+factorial_iterativo(num));
        System.out.println("Factorial de "+num+"!= "+factorial_recursivo(num));
    }

    public static long factorial_iterativo(int n){
        long fact=1L;
        for(int i=n;i>0;i--){
            fact=fact*i;
        }
        return fact;

    }
    public static long factorial_recursivo(int n){
        if (n==0)
           return 1;
        else
            return n*factorial_recursivo(n-1);
    }

    
    
}
