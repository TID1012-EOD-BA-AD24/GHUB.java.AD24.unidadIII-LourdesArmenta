package mcd;

import java.util.Scanner;

public class Mcd{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("introduce número entero:");
        int b1=entrada.nextInt();
        System.out.print("introduce número entero:");
        int b2=entrada.nextInt();
        System.out.println("El Maximo Comun Dividor entre "+b1+" Y "+b2+" es "+
                mcd_recursivo(b1,b2));
    }
    public static int mcd_recursivo(int m,int n){
        if(n<=m && m%n ==0)
            return n;
        else if(m<n)
            return mcd_recursivo(n,m);
        else
            return mcd_recursivo(n,m%n);

    }
    public static void mcd_iterativo(int m,int n){

    }

}