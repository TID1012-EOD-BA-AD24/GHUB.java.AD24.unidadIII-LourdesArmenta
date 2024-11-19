package arboles;
public class ClienteMainArbolOrd{
    public static void main(String[] args) {
        ArbolBinarioOrdenado arbol = new ArbolBinarioOrdenado();
        try{
            arbol.insertar(new Estudiante(123,"Juan Perez"));
            arbol.insertar(new Estudiante(124,"Luisa Guerrero"));
            arbol.insertar(new Estudiante(125,"Ana Beltran"));
            arbol.insertar(new Estudiante(120,"Carlos Rodriguez"));
            System.out.println();
            arbol.preorden();
            System.out.println();
            arbol.inorden();
            System.out.println();
            arbol.postorden();



            


        }catch(Exception e){
            System.out.println("Error: "+e.getMessage());

        }
        //Recorridos
        System.out.println();
        arbol.preorden();
        System.out.println();
        arbol.inorden();
        System.out.println();
        arbol.postorden();
        //Buqueda iterativa
        Nodo aux =arbol.buscar(new Estudiante(125,"Ana Beltran"));
        if (aux==null)
            System.out.println("\nDato no encontrado");
        else
            System.out.println("\n"+aux.getValor());
        //busqueda recursiva
        aux =arbol.buscar2(new Estudiante(120,"Carlos Rodriguez"));
        if (aux==null)
            System.out.println("\nDato no encontrado");
        else
            System.out.println("\n"+aux.getValor());

        try{
            arbol.eliminar(new Estudiante(125,"Ana Beltran"));

        }catch (Exception e){
            e.printStackTrace();
        }
         //Recorridos
         System.out.println();
         arbol.preorden();
         System.out.println();
         arbol.inorden();
         System.out.println();
         arbol.postorden();


    
    }
}