package arboles;

public class ClienteMainArbBinOrd {
    public static void main(String[] args) {
        ArbolBinarioOrdenado ab = new ArbolBinarioOrdenado();
        Estudiante e1 = new Estudiante(123,"Juan Perez");
        Estudiante e2 = new Estudiante(101,"Margarita ruiz");
        Estudiante e3 = new Estudiante(100,"Pedro Sanchez");
        Estudiante e4 = new Estudiante(200,"Ana Beltran");
        try{
             ab.insertar(e1);
             ab.insertar(e2);
             ab.insertar(e3);
             ab.insertar2(e4); //version recursiva
             ab.insertar(e4);

            

        }catch(Exception ex){
            System.out.println("Error: ocurrio una excepcion"+ex.getMessage());
        }
            System.out.println("\nRecorrido PreOrden");
            ab.preorden();
            System.out.println("\nRecorrido InOrden");
            ab.inorden();
            System.out.println("\nRecorrido PostOrden");
            ab.postorden();
            System.out.println();
            System.out.println("Arbol Jerarquico");
            BTreePrinter.printNode(ab.getRaiz());
            //busqueda

            //busqueda iterativa
            Nodo aux = ab.buscar(e4);
            if(aux ==null){
                System.out.println("\nDato no encontrado");
            }else{
                System.out.println("\nEncontrado el dato: "+aux.getValor());
            }

            //busqueda recursiva
            Estudiante e5 = new Estudiante(124,"Daniel Parra");
            aux = ab.buscar2(e5);
            if(aux ==null){
                System.out.println("\nDato no encontrado");
            }else{
                System.out.println("\nEncontrado el dato: "+aux.getValor());
            }
            try{
                ab.eliminar(e3);
                System.out.println();
                System.out.println("Arbol Jerarquico despues de eliminar e3:");
                BTreePrinter.printNode(ab.getRaiz());
                ab.eliminar(e1);
                System.out.println("\nArbol Jerarquico despues de eliminar e1:");
                BTreePrinter.printNode(ab.getRaiz());
                ab.eliminar(e1);



            }catch(Exception ex){
                System.out.println("Error: ocurrio una excepcion"+ex.getMessage());
            }

            




    }
    
}
