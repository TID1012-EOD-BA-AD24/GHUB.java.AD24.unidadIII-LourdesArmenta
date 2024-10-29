package pared;
public class Pared{
    public static void main(String[] args) {
        System.out.println("Dibujar una pared de n cantidad de hileras de forma iterativa");
        dibujarPared_iterativa(10);
        System.out.println("Dibujar una pared de n cantidad de hileras de forma recursiva");
        dibujarPared_recursiva(10);
        
    }
    public static void dibujarPared_iterativa(int n){
        //solucion iterativa
         
        for(int i=0; i<n; i++){
            System.out.println("**********");
        }
            
    }
    public static void dibujarPared_recursiva(int n){
        if (n>1)
            dibujarPared_recursiva(n-1);

        System.out.println("**********");

        

    }
}