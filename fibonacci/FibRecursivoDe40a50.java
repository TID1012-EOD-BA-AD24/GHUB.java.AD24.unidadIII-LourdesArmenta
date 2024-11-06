package fibonacci;
import performance.Performance;

public class FibRecursivoDe40a50 {
    private static long cont;
    public static void main(String[] args) {
        Performance p = new Performance();
        int desde = 40;
        int hasta = 50;
        double ant = -1;
        for(int i=desde; i<=hasta;i++){
            //inicializamos un contador
            cont = -1;
            //comenzamos a tomar el tiempo
            p.start();
            //invocamos a la funcion recursova
            double f = fibonacci_recursivo(i);
            //detenemos el tiempo
            p.stop();
            System.out.print("f("+i+")="+f+", "+p.getMillis()+"ms, "+cont+" veces. ");
            //si no es el primero entonces calculamos el incremento de tiempo
            if(ant>0){
                System.out.println("Incremento = "+f/ant);
            }else{
                System.out.println();
            }
            //Ahora, el termino será el que recien calculamos
            ant = f;

        }
    }
    public static long fibonacci_recursivo(int n){
        //incrementador el contador
        cont++;

        if(n<=1)
           return n;
        else
           return fibonacci_recursivo(n-1)+fibonacci_recursivo(n-2);
    }
    
    
}
