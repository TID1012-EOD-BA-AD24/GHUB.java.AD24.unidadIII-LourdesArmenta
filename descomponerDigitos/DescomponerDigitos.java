package descomponerDigitos;
import java.util.Scanner;

public class DescomponerDigitos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("introduce número que deseas descomponer:");
        int num=entrada.nextInt();
        System.out.println("Suma de Digitos: "+suma_digitos_iterativa(num));
        System.out.println("Suma de Digitos: "+suma_digitos_recursiva(num));
    }

    public static int suma_digitos_iterativa(int num){
        int suma = 0;
        while(num>9)
        {
            suma = suma + num%10;
            num = num/10;
        }
        return (suma+num);


    }

    public static int suma_digitos_recursiva(int num){
        if (num<9)
           return num;
        else
           return suma_digitos_recursiva(num/10)+num%10;
            
        
    }

    
}
