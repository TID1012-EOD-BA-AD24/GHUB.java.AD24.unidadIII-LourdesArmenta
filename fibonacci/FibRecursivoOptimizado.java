package fibonacci;
import java.util.Scanner;
import java.util.HashMap;

public class FibRecursivoOptimizado {
    public static void main(String[] args) {
        //inicializamos la tabla
        HashMap<Integer, Double> t = new HashMap<>();
        t.put(1,1d);
        t.put(2,1d);
        //el usuario ingrese el valor
        Scanner scanner = new Scanner(System.in);
        System.out.print("¿Cuántos terminos quiere ver?");
        int n= scanner.nextInt();
        for(int i=1;i<=n;i++)
        {
            double f = fibonacci_recursivo(i, t);
            System.out.println("fib("+i+")= "+f);
        }
 
    }
    private static double fibonacci_recursivo(int x, HashMap<Integer,Double> t){
        //primero verificamos si el resultado esta en la tabla
        Double d = t.get(x);
        //si no esta entonces lo calculamos y lo ingresamos a la tabla
        if (d==null){
            d=fibonacci_recursivo(x-1, t)+fibonacci_recursivo(x-2, t);
            t.put(x, d);
        }
        //retornamos el resultado
        return d;
    }

}
    

