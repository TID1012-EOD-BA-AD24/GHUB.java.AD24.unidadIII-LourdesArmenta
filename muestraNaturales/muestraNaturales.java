package muestraNaturales;
import  java.util.Scanner;
public class muestraNaturales{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("introduce cantidad de numero naturales que quieres mostrar por pantalla:");
        int n=entrada.nextInt();
        muestraNaturales_iterativa(n);
        muestraNaturales_recursiva(n);
        
    }

    public static void muestraNaturales_iterativa(int n){
        for(int i=1 ;i<=n;i++){
            System.out.print(i+" ");
        }
        System.err.println();

    }

    public static void muestraNaturales_recursiva(int n){
        if (n>1)
            muestraNaturales_recursiva(n-1);
        
        System.out.print(n+" ");

        
     

    }
}