package sumaDigitos;

import java.util.Scanner;

public class SumaDigitos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("introduce número entero:");
        int num=entrada.nextInt();
        System.out.println("Suma de los primeros "+num+" numeros naturales = "+
            sumaDigitos_iterariva(num));

            System.out.println("Suma de los primeros "+num+" numeros naturales = "+
            sumaDigitos_recursiva(num));
    }
    public static long sumaDigitos_iterariva(int n){
        long suma = 0;

        for(int i=1;i<=n;i++){
            suma = suma +i;
        }
        return suma;

    }
    public static long sumaDigitos_recursiva(int n){
        long suma = 0;
        if (n==1)
           return 1;
        else
            suma = n+sumaDigitos_recursiva(n-1);
           // return n+sumaDigitos_recursiva(n-1);
        return suma;
    }
    
}
